import dbdemo.mongo.MongoApplication;
import dbdemo.mongo.models.User;
import dbdemo.mongo.resporties.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/7/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MongoApplication.class)
public class MongoApplicationTests {
    @Autowired
    private UserRepository userRepository;
    @Before
    public void setUp(){
        //userRepository.deleteAll();
    }
    @Test
    public void test(){
        // 创建三个User，并验证User总数
        //userRepository.save(new User("1", "didi", 30));
       // userRepository.save(new User("2", "mama", 40));
        userRepository.save(new User("3", "whk", 50));
       // Assert.assertEquals(3, userRepository.findAll().size());

        // 删除一个User，再验证User总数
        User u = userRepository.findOne("1");
       // userRepository.delete(u);
       // Assert.assertEquals(2, userRepository.findAll().size());

        // 删除一个User，再验证User总数
        u = userRepository.findByUsername("mama");
       // userRepository.delete(u);
      //  Assert.assertEquals(1, userRepository.findAll().size());
    }
}
