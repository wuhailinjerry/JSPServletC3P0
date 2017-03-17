package net.smartbetter.jspservletc3p0.test;

import net.smartbetter.jspservletc3p0.util.StringHelper;
import net.smartbetter.jspservletc3p0.db.DBUtil;

public class DBUtilTest {

	public static void main(String[] args) {
		//能够获取到链接对象
		System.out.println(DBUtil.getConnection());
		//测试一下查询
		System.out.println(DBUtil.executeQuery("select user_name from user where id=1"));

		//测试修改
		System.out.println(StringHelper.getCurrentFormatDate());
		System.out.println(StringHelper.getCurrentTimeStamp());
	}
}
