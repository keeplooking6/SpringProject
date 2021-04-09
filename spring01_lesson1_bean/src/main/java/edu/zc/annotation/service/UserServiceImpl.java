package edu.zc.annotation.service;

import edu.zc.annotation.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public void saveAndAlter() {
        userDao.alter();
        userDao.saveUser();
    }
}
