package edu.zc;

import edu.zc.annotation.dao.IUserDao;
import edu.zc.annotation.service.IUserService;
import edu.zc.service.IProductService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _02AnnotationUserTest {
    /**
     * 构造器注入
     */
    @Test
    public void user06(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring1.xml");
        IProductService productService = (IProductService) ac.getBean("productService");
        productService.queryAndAdd();
    }
    /**
     * 注解代替bean
     * 1.getBean用class文件
     * 2.getBean用@Component
     */
    @Test
    public void user07(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring2.xml");
        IUserDao iUserDao = ac.getBean(IUserDao.class);
        iUserDao.saveUser();
    }

    @Test
    public void user08(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring2.xml");
        IUserDao userDao = (IUserDao) ac.getBean("userDao");
        userDao.alter();
    }

    @Test
    public void user09(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring2.xml");
        IUserService userService = ac.getBean(IUserService.class);
        userService.saveAndAlter();
    }
}
