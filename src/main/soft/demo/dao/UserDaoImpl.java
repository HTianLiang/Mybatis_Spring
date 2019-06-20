package soft.demo.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

/*
    Dao原始开发
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    //声明工厂
    public void insertUser(){
        //this.getSqlSession().insert();
    }

}
