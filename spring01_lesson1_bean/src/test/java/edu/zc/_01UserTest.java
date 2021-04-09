package edu.zc;

import edu.zc.dao.IUserDao;
import edu.zc.entity.User;
import edu.zc.service.IProductService;
import edu.zc.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _01UserTest {
    /**
     * 传统方式实例化对象
     */

    @Test
    public void user01(){
        User user = new User("wxl",18);
        System.out.println(user);
    }

    /**
     * spring方式获取spring对象
     */

    @Test
    public void user02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
        User user02 = (User) context.getBean("user01");
        System.out.println(user02);

    }

    /**
     * 只可调用一个dao的方法
     */
    @Test
    public void user03(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring1.xml");
        IUserDao userDao = (IUserDao) ac.getBean("userDao");
        userDao.saveUser();
    }

    /**
     * 业务层：调用多个dao方法
     * setter注入:userService和productService
     */
    @Test
    public void user04(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring1.xml");
        IUserService userService = (IUserService) ac.getBean("userService");
        userService.saveAndAlter();
    }

    @Test
    public void user05(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring1.xml");
        IProductService productService = (IProductService)ac.getBean("productService");
        productService.queryAndAdd();
    }



}
