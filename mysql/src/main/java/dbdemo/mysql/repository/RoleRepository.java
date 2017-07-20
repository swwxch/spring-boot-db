package dbdemo.mysql.repository;

import dbdemo.mysql.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/7/19.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role,Long>{
}
