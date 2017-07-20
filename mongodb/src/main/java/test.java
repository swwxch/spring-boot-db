import dbdemo.mysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/7/19.
 */
@RestController
public class test {
   @Autowired
    private UserRepository userRepository;
    public  void get(){

    }

}
