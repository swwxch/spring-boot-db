package dbdemo.mysql.repository;

import dbdemo.mysql.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/7/19.
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{
}
