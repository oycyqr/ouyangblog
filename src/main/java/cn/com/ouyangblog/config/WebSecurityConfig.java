package cn.com.ouyangblog.config;

import cn.com.ouyangblog.service.OuYangUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.annotation.Resource;

/**
 * @author oyc
 * @Title: WebSecurityConfig
 * @ProjectName ouyangblog
 * @Description: Spring Security 配置类
 * @date 2018/11/17 12:06
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    public OuYangUserService ouYangUserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                //定义不需要验证的请求
                .antMatchers("/api/index/**", "/index", "/home", "/about", "/vueTest", "/config/**", "/**/*.js", "/**/*.css", "/img/**", "/*/*.*.png").permitAll()
                .antMatchers("/*").permitAll()
                .antMatchers("/**/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated()//其余的需要验证
                //定义login不需要验证
                .and().formLogin().loginPage("/login").permitAll()
                .and().logout()//定义logout不需要验证
                .and().csrf().disable();
        super.configure(http);
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(ouYangUserService).passwordEncoder(new MyPasswordEncoder());
                /*.inMemoryAuthentication().passwordEncoder(new MyPasswordEncoder())
                .withUser("ouyang")//用户名
                .password("123456")
                .roles("ADMIN");*/
    }

}
