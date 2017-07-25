package dbdemo.mongo.models;

import org.springframework.data.annotation.Id;

/**
 * Created by Administrator on 2017/7/24.
 */
public class User {

    @Id
    private String id;
    private String username;
    private int age;

    public User(){

    }
    public User(String id, String username, int age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }
    public User( String username, int age) {
        this.username = username;
        this.age = age;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
