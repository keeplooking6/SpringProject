package edu.zc.service;

import edu.zc.dao.IUserDao;
import edu.zc.dao.UserDaoImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;


@Setter
public class UserServiceImpl implements IUserService{

    private IUserDao userDao;

    @Override
    public void saveAndAlter() {
//        userDao = new UserDaoImpl();
        System.out.println("wxl吃pp");
        userDao.alter();
        userDao.saveUser();
    }
}
