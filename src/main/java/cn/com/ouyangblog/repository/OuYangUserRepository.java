package cn.com.ouyangblog.repository;

import cn.com.ouyangblog.domain.OuYangUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author oyc
 * @Title: OuYangUserRepositoryTest
 * @ProjectName ouyangblog
 * @Description: TODO
 * @date 2018/11/15 21:48
 */
@Repository
public interface OuYangUserRepository extends JpaRepository<OuYangUser, Integer> {
    OuYangUser findByAccount(String account);
}
