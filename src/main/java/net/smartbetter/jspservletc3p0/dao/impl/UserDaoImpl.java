package net.smartbetter.jspservletc3p0.dao.impl;

import net.smartbetter.jspservletc3p0.dao.IUserDao;
import net.smartbetter.jspservletc3p0.db.DBUtil;
import net.smartbetter.jspservletc3p0.db.IResultSetUtil;
import net.smartbetter.jspservletc3p0.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 实现用户操作的接口类
 * Created by gc on 17/1/6.
 */
public class UserDaoImpl implements IUserDao {

    /**
     * 登录的实现方法
     *
     * @param user_id
     * @param user_pass
     * @return 1:用户名错误；2：密码错误；3:正确
     */
    @Override
    public String login(String user_id, String user_pass) {
        String sql = "SELECT user_pass FROM user WHERE user_id = ? "; //SQL
        Object obj = DBUtil.executeQuery(sql, user_id);
        if (obj == null) {
            return "1"; //用户名错误
        } else {
            if (obj.toString().equals(user_pass)) {
                return "3"; //正确
            } else {
                return "2"; //密码错误
            }
        }
    }

    /**
     * 根据用户账号获取用户信息
     *
     * @param user_id
     * @return
     */
    @Override
    public User getUserByUserId(final String user_id) {
        String sql = "SELECT user_creator,user_name,user_telephone,user_birthday,user_city,user_pass,user_faq,user_answer,created_time FROM user WHERE user_id=?";
        return (User) DBUtil.executeQuery(sql, new IResultSetUtil() {
            @Override
            public Object doHandler(ResultSet rs) throws SQLException {
                if (rs.next()) {
                    User user = new User();
                    user.setUser_creator(rs.getString(1));
                    user.setUser_name(rs.getString(2));
                    user.setUser_telephone(rs.getString(3));
                    user.setUser_birthday(rs.getString(4));
                    user.setUser_city(rs.getString(5));
                    user.setUser_pass(rs.getString(6));
                    user.setUser_faq(rs.getInt(7));
                    user.setUser_answer(rs.getString(8));
                    user.setUser_id(user_id);
                    user.setCreated_time(rs.getLong(9));
                    return user;
                }
                return null;
            }
        }, user_id);
    }

    /**
     * 保存用户信息
     *
     * @param user
     * @return
     */
    @Override
    public boolean saveUserInfo(User user) {
        String sql = "UPDATE user SET user_name=?,user_birthday=?,user_telephone=?,user_city=?,user_pass=?,user_faq=?,user_answer=? WHERE user_id = ?";
        return DBUtil.executeUpdate(sql, user.getUser_name(), user.getUser_birthday(),
                user.getUser_telephone(), user.getUser_city(), user.getUser_pass(),
                user.getUser_faq(), user.getUser_answer(), user.getUser_id()) > 0;
    }

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    @Override
    public boolean addUser(User user) {
        String sql = "INSERT INTO user (user_id,user_name,user_birthday,user_telephone,user_city,user_pass,user_creator,created_time) VALUES (?,?,?,?,?,?,?,?) ";

        return DBUtil.executeUpdate(sql, user.getUser_id(), user.getUser_name(),
                user.getUser_birthday(), user.getUser_telephone(), user.getUser_city(),
                user.getUser_pass(), user.getUser_creator(), user.getCreated_time()) > 0;
    }

}
