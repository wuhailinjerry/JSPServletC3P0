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
 * 保存会员中心信息
 */
public class SaveMainServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * 修改的保存方法
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();
//		if (session.getAttribute("user") != null) {
        // 调用业务逻辑处理类
        IUserService userService = new UserServiceImpl();
        User user = userService.getUserByUserId(session.getAttribute("user").toString());
        user.setUser_name(req.getParameter("user_name"));
        user.setUser_birthday(req.getParameter("user_birthday"));
        user.setUser_telephone(req.getParameter("user_telephone"));
        user.setUser_city(req.getParameter("user_city"));
        // 修改密码，不填不修改
        String user_pass = req.getParameter("user_pass");
        if (user_pass != "") {
            // 设置新密码
            try {
                user.setUser_pass(StringHelper.encryptMD5(user_pass));
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        } else {
            // 保持原来的密码
            user.setUser_pass(req.getParameter("hf_pass"));
        }
        user.setUser_faq(Integer.parseInt(req.getParameter("user_faq")));
        user.setUser_answer(req.getParameter("user_answer"));
        boolean b = userService.saveUserInfo(user);
        if (b) {
            req.setAttribute("msg", "修改信息成功!");
        } else {
            req.setAttribute("msg", "修改信息失败!");
        }
        req.getRequestDispatcher("success.jsp").forward(req, resp);
//		} else {
//			System.out.println("您还没有登录，请先登录！");
//			resp.sendRedirect(req.getContextPath() + "/index.jsp");
//		}
    }

}
