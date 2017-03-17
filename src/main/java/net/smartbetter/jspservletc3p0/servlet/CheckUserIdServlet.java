package net.smartbetter.jspservletc3p0.servlet;

import net.smartbetter.jspservletc3p0.entity.User;
import net.smartbetter.jspservletc3p0.service.IUserService;
import net.smartbetter.jspservletc3p0.service.impl.UserServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 验证登录账号是否可用
 * 
 * @author Auger
 * 
 */
public class CheckUserIdServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String user_id = req.getParameter("user_id");
		IUserService userService = new UserServiceImpl();
		User user = userService.getUserByUserId(user_id);
		PrintWriter out = resp.getWriter();
		if (user == null) {
			// 表示可以使用
			out.print("0");
		} else {
			// 表示不可使用
			out.print("1");
		}

	}

}
