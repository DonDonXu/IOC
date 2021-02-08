package org.example;

public class UserServiceImpl implements UserService {
    private UserDao userdao ;

    @Override
    public void getUser() {
        userdao.getUser();
    }

    public void setUserdao(UserDao userdao){
        this.userdao = userdao;
    }

    public UserDao getUserdao(){
        return userdao;
    }
}
