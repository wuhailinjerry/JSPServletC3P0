package net.smartbetter.jspservletc3p0.service;

import net.smartbetter.jspservletc3p0.entity.User;

/**
 * 用户业务逻辑的接口
 * Created by gc on 17/1/6.
 */
public interface IUserService {

    /**
     * 用户信息操作的接口类
     * @param user_id
     * @param user_pass
     * @return 1:用户名错误, 2:密码错误, 3:正确
     */
    public String login(String user_id, String user_pass);

    /**
     * 根据用户账号获取用户信息
     * @param user_id
     * @return
     */
    public User getUserByUserId(String user_id);

    /**
     * 保存用户信息
     * @param user
     * @return
     */

    public boolean saveUserInfo(User user);
    /**
     * 添加用户信息
     * @param user
     * @return
     */
    public boolean addUser(User user);

}
