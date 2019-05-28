package com.wl.config;

import com.wl.dao.springboot.*;
import com.wl.entity.SysPermission;
import com.wl.entity.SysRole;
import com.wl.entity.User;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * Realm
 *
 * @author Weilin
 */
public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserDao userDao;

    @Autowired
    private SysUserRoleDao sysUserRoleDao;

    @Autowired
    private SysPermissionDao sysPermissionDao;

    @Autowired
    private SysUserPermissionDao sysUserPermissionDao;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("权限配置-->MyShiroRealm.doGetAuthorizationInfo()");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        User userInfo = (User) principals.getPrimaryPrincipal();
        //获取用户所有角色信息
        List<SysRole> roles = sysUserRoleDao.findByUserId(userInfo.getId());
        for (SysRole role : roles) {
            authorizationInfo.addRole(role.getRole());
            //获取角色对应的所有权限
            List<SysPermission> permissions = sysUserPermissionDao.findByRole(role.getId());
            for (SysPermission p : permissions) {
                authorizationInfo.addStringPermission(p.getPermission());
            }
        }
        return authorizationInfo;
    }

    /**
     * 主要是用来进行身份认证的，也就是说验证用户输入的账号和密码是否正确。
     *
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
            throws AuthenticationException {
        System.out.println("MyShiroRealm.doGetAuthenticationInfo()");
        //获取用户的输入的账号.
        String username = (String) token.getPrincipal();
        System.out.println(token.getCredentials());
        //通过username从数据库中查找 User对象，如果找到，没找到.
        //实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
//        User userInfo = userDao.findByUsername(username);
        User userInfo = userDao.getById(1L);
        System.out.println("----->>userInfo=" + userInfo);
        if (userInfo == null) {
            return null;
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                userInfo, //用户名
                userInfo.getPassword(), //密码
                getName()  //realm name
        );
        return authenticationInfo;
    }

}