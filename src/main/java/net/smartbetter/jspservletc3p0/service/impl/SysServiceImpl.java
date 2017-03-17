package net.smartbetter.jspservletc3p0.service.impl;

import net.smartbetter.jspservletc3p0.dao.ISysDao;
import net.smartbetter.jspservletc3p0.dao.impl.SysDaoImpl;
import net.smartbetter.jspservletc3p0.entity.Sys;
import net.smartbetter.jspservletc3p0.service.ISysService;

import java.util.List;

/**
 * 实现系统设置业务逻辑的接口类
 * Created by gc on 17/1/6.
 */
public class SysServiceImpl implements ISysService {

    /**
     * 更新设置
     */
    @Override
    public boolean update(Sys sys) {
        ISysDao sysDao = new SysDaoImpl();
        return sysDao.update(sys);
    }

    /**
     * 获取所有设置
     */
    @Override
    public List<Sys> getList() {
        ISysDao sysDao = new SysDaoImpl();
        return sysDao.getList();
    }
}
