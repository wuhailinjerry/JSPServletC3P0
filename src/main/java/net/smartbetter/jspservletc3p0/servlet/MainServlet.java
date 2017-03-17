package net.smartbetter.jspservletc3p0.servlet;

import net.smartbetter.jspservletc3p0.entity.User;
import net.smartbetter.jspservletc3p0.service.IUserService;
import net.smartbetter.jspservletc3p0.service.impl.UserServiceImpl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 会员中心
 * Created by gc on 17/1/6.
 */
public class MainServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();
//		if (session.getAttribute("user") != null) {
        //调用业务逻辑处理类
        IUserService userService = new UserServiceImpl();
        User user = userService.getUserByUserId(session.getAttribute("user").toString());
        req.setAttribute("user", user);
        req.getRequestDispatcher("main.jsp").forward(req, resp);
//		} else {
//			System.out.println("您还没有登录，请先登录！");
//			resp.sendRedirect(req.getContextPath() + "/index.jsp");
//		}
    }

}
