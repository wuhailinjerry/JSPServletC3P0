package net.smartbetter.jspservletc3p0.service.impl;

import net.smartbetter.jspservletc3p0.dao.IUserDao;
import net.smartbetter.jspservletc3p0.dao.impl.UserDaoImpl;
import net.smartbetter.jspservletc3p0.entity.User;
import net.smartbetter.jspservletc3p0.service.IUserService;

/**
 * 实现用户业务逻辑的接口类
 * Created by gc on 17/1/6.
 */
public class UserServiceImpl implements IUserService {

    /**
     * 登录的实现方法 （1:用户名错误；2：密码错误；3:正确）
     */
    @Override
    public String login(String user_id, String user_pass) {
        IUserDao userDao = new UserDaoImpl();
        return userDao.login(user_id, user_pass);
    }

    /**
     * 根据用户账号获取用户信息
     */
    @Override
    public User getUserByUserId(String user_id) {
        IUserDao userDao = new UserDaoImpl();
        return userDao.getUserByUserId(user_id);
    }

    /**
     * 根据用户账号修改用户信息
     */
    @Override
    public boolean saveUserInfo(User user) {
        IUserDao userDao = new UserDaoImpl();
        return userDao.saveUserInfo(user);
    }

    /**
     * 新增用户
     */
    @Override
    public boolean addUser(User user) {
        IUserDao userDao = new UserDaoImpl();
        return userDao.addUser(user);
    }

}
