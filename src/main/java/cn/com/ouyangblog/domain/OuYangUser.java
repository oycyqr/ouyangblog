package cn.com.ouyangblog.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author oyc
 * @Title: OuYangUser
 * @ProjectName ouyangblog
 * @Description: TODO
 * @date 2018/11/15 21:21
 */
@Entity
@Data
@Table(name="user")
public class OuYangUser {
    @Id
    private Integer id;
    private String name;
    private String account;
    private String password;
}
