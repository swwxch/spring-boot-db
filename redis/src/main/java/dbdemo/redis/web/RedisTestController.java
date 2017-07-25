package dbdemo.redis.web;

import com.google.gson.Gson;
import dbdemo.mysql.entity.User;
import dbdemo.redis.repository.UserRedis;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;

/**
 * Created by Administrator on 2017/7/21.
 */
@RestController
@RequestMapping(value = "/test")
public class RedisTestController {
    private Logger logger = Logger.getLogger(getClass());
    @Autowired
    private UserRedis userRedis;

    @RequestMapping(value = "/redis")
    public String get(ServletRequest request){
        String id = request.getParameter("id");
        User user = userRedis.get("usernamea");
        Gson gson = new Gson();
        String json = gson.toJson(user);
        logger.error("json="+json);
        logger.info("json="+json);
        return json+id;
    }
}
