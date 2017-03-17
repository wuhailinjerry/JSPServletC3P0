package net.smartbetter.jspservletc3p0.dao.impl;

import net.smartbetter.jspservletc3p0.dao.ISysDao;
import net.smartbetter.jspservletc3p0.db.DBUtil;
import net.smartbetter.jspservletc3p0.db.IResultSetUtil;
import net.smartbetter.jspservletc3p0.entity.Sys;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 实现系统设置操作的接口类
 * Created by gc on 17/1/6.
 */
public class SysDaoImpl implements ISysDao {

    /**
     * 更新系统设置
     */
    @Override
    public boolean update(Sys sys) {
        String sql = "UPDATE sys SET user_min=?,user_max=? WHERE id=?";
        return DBUtil.executeUpdate(sql, sys.getUser_min(), sys.getUser_max()) > 0;
    }

    /**
     * 获取所有的系统设置记录数
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<Sys> getList() {
        String sql = "SELECT id,user_min,user_max FROM sys";
        return (List<Sys>) DBUtil.executeQuery(sql, new IResultSetUtil() {
            List<Sys> list = new ArrayList<Sys>();
            @Override
            public Object doHandler(ResultSet rs) throws SQLException {
                while (rs.next()) {
                    Sys sys = new Sys();
                    sys.setUser_min(rs.getInt(1));
                    sys.setUser_max(rs.getInt(2));
                    list.add(sys);
                }
                return list;
            }
        });
    }

}
