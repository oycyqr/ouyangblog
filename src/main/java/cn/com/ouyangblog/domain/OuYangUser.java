package cn.com.ouyangblog.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author oyc
 * @Title: OuYangUser
 * @ProjectName ouyangblog
 * @Description: 系统用户实体类
 * @date 2018/11/15 21:21
 */
@Entity
@Data
@Table(name = "user")
public class OuYangUser {
    @Id
    private Integer id;

    private String name;

    private String account;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
