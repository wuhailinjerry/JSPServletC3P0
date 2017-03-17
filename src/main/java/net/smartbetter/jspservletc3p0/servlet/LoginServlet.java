package net.smartbetter.jspservletc3p0.servlet;

import net.smartbetter.jspservletc3p0.service.IUserService;
import net.smartbetter.jspservletc3p0.service.impl.UserServiceImpl;
import net.smartbetter.jspservletc3p0.util.StringHelper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;

/**
 * 登录
 * Created by gc on 17/1/6.
 */
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();

        String account = req.getParameter("account");//获取到用户名
        String password = req.getParameter("password");//获取到密码

        //调用业务逻辑处理类
        IUserService userService = new UserServiceImpl();

        //接收返回的结果
        String result = null;

        try {
            System.out.println("account：" + account + "，password：" + password);
            result = userService.login(account, StringHelper.encryptMD5(password));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        if (result.equals("3")) {
            //用户名和密码都正确，把用户名存入到Session中，然后在head.jsp通过EL表达式显示user
            session.setAttribute("user", account);
            //设置失效时间3600秒
            session.setMaxInactiveInterval(3600);
        }
        PrintWriter out = resp.getWriter();
        //out.println("我是返回的结果值"); //Ajix请求登录，返回值中文乱码，解决：设置CharsetEncodingFilter
        //把结果返回给Ajax请求
        out.println(result);
    }

}
