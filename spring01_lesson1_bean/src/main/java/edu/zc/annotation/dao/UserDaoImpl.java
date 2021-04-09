package edu.zc.annotation.dao;

import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDaoImpl implements IUserDao {
    @Override
    public void saveUser() {
        System.out.println("保存用户");
    }

    @Override
    public void alter() {
        System.out.println("修改用户");
    }

}
