package net.smartbetter.jspservletc3p0.servlet;

import net.smartbetter.jspservletc3p0.entity.User;
import net.smartbetter.jspservletc3p0.service.IUserService;
import net.smartbetter.jspservletc3p0.service.impl.UserServiceImpl;
import net.smartbetter.jspservletc3p0.util.StringHelper;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 添加会员
 */
public class AddUserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		String user_id = req.getParameter("user_id");
		String user_name = req.getParameter("user_name");
		String user_birthday = req.getParameter("user_birthday");
		String user_telephone = req.getParameter("user_telephone");
		String user_city = req.getParameter("user_city");
		String user_pass = req.getParameter("user_pass");
		String user_creator = session.getAttribute("user").toString();

		IUserService userSerive = new UserServiceImpl();

		User user = new User();
		user.setUser_id(user_id);
		user.setUser_name(user_name);
		user.setUser_birthday(user_birthday);
		user.setUser_telephone(user_telephone);
		user.setUser_city(user_city);
		try {
			user.setUser_pass(StringHelper.encryptMD5(user_pass));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		user.setUser_creator(user_creator);
		user.setCreated_time(StringHelper.getCurrentTimeStamp());

		if (userSerive.addUser(user)) {
			req.setAttribute("msg", "保存成功!");
		} else {
			req.setAttribute("msg", "保存失败!");
		}
		req.getRequestDispatcher("add.jsp").forward(req, resp);

	}

}
