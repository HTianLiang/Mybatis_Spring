package soft.demo.junit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import soft.demo.interf.UserMapper;
import soft.demo.pojo.User;

public class JunitTest {

    @Test
    public void test(){
        ApplicationContext acx = new ClassPathXmlApplicationContext("soft/demo/config/applicationContext.xml");
        UserMapper userMappper = (UserMapper) acx.getBean("userMappper");
        //或acx.getBean(UserMapper.class)
        User user = userMappper.selectUserById(16);
        System.out.println("\n"+user);
    }
    @Test
    /*
        增强：Mapper动态代理
        使用acx.getBean(UserMapper.class)
     */
    public void test1(){
        ApplicationContext acx = new ClassPathXmlApplicationContext("soft/demo/config/applicationContext.xml");
        UserMapper userMapper = acx.getBean(UserMapper.class);
        User user = userMapper.selectUserById(10);
        System.out.println("\n"+user);
    }

}
