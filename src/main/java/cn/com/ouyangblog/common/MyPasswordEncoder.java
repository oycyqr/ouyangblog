package cn.com.ouyangblog.common;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author oyc
 * @Title: MyPasswordEncoder
 * @ProjectName ouyangblog
 * @Description:密码加密类
 * @date 2018/11/17 12:24
 */
public class MyPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }

}