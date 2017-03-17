package net.smartbetter.jspservletc3p0.dao;

import net.smartbetter.jspservletc3p0.entity.Sys;

import java.util.List;

/**
 * 系统设置的接口类
 * Created by gc on 17/1/6.
 */
public interface ISysDao {

    /**
     * 更新系统设置
     * @param sys
     * @return
     */
    public boolean update(Sys sys);

    /**
     * 获取所有的系统设置记录
     * @return
     */
    public List<Sys> getList();
}
