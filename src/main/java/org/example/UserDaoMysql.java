package org.example;

public class UserDaoMysql implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取mysql用户");
    }
}
