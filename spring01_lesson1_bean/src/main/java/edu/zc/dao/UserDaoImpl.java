package edu.zc.dao;

public class UserDaoImpl implements IUserDao{
    @Override
    public void saveUser() {
        System.out.println("保存用户");
    }

    @Override
    public void alter() {
        System.out.println("修改用户");
    }

}
