package cn.com.ouyangblog.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

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
public class OuYangUser implements Serializable {

    @Id
    private Integer id;

    private String name;

    private String account;

    private String password;

    @Override
    public String toString() {
        return "OuYangUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
