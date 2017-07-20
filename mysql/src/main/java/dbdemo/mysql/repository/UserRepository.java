package dbdemo.mysql.repository;

import dbdemo.mysql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/7/19.
 */
@Repository
public interface UserRepository extends JpaRepository<User,String> {
    User findByNameLike(String name);
    User readByName(String name);
    List<User> getByCreatedateLessThan(Date star);
}
