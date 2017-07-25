package dbdemo.mongo.resporties;

import dbdemo.mongo.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Administrator on 2017/7/24.
 */
public interface UserRepository extends MongoRepository<User,String> {
    User findByUsername(String username);
}
