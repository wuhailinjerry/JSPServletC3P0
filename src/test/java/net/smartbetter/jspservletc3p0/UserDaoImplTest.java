package net.smartbetter.jspservletc3p0;

import net.smartbetter.jspservletc3p0.dao.impl.UserDaoImpl;
import net.smartbetter.jspservletc3p0.entity.User;

import java.security.NoSuchAlgorithmException;

public class UserDaoImplTest {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		UserDaoImpl userDao = new UserDaoImpl();
		User u = userDao.getUserByUserId("1");
		u.setUser_city("深圳");
		u.setUser_faq(20);
		System.out.println(userDao.saveUserInfo(u));
	}

}
