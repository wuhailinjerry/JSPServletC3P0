package net.smartbetter.jspservletc3p0.db;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 处理ResultSet的接口
 * Created by gc on 17/1/6.
 */
public interface IResultSetUtil {
	public Object doHandler(ResultSet rs) throws SQLException;
}
