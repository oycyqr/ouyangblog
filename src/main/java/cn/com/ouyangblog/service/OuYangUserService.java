package cn.com.ouyangblog.service;

import cn.com.ouyangblog.domain.OuYangUser;
import cn.com.ouyangblog.repository.OuYangUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author oyc
 * @Title: OuYangUserService
 * @ProjectName ouyangblog
 * @Description: TODO
 * @date 2018/11/16 22:52
 */
@Service
public class OuYangUserService implements UserDetailsService {

    @Autowired
    private OuYangUserRepository ouYangUserRepository;

    @Override
    /**  * 根据用户名获取用户 - 用户的角色、权限等信息   */
    public UserDetails loadUserByUsername(String account) throws UsernameNotFoundException {
        UserDetails userDetails = null;
        try {
            OuYangUser ouYangUser = ouYangUserRepository.findByAccount(account);
            Collection<GrantedAuthority> authList = getAuthorities();
            userDetails = new User(account, ouYangUser.getPassword().toLowerCase(),true,true,true,true,authList);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return userDetails;
    }

    /**  * 获取用户的角色权限,为了降低实验的难度，这里去掉了根据用户名获取角色的步骤     * @param    * @return   */
    private Collection<GrantedAuthority> getAuthorities(){
        List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();
        authList.add(new SimpleGrantedAuthority("ROLE_USER"));
        authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        return authList;
    }

}
