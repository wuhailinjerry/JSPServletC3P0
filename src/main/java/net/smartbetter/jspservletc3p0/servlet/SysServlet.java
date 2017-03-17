package net.smartbetter.jspservletc3p0.servlet;

import net.smartbetter.jspservletc3p0.entity.Sys;
import net.smartbetter.jspservletc3p0.service.ISysService;
import net.smartbetter.jspservletc3p0.service.impl.SysServiceImpl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SysServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String method = req.getParameter("m");
		if (method == null) {
			ISysService sysService = new SysServiceImpl();
			List<Sys> list = sysService.getList();
			System.out.println("记录数：" + list.size());
			req.getRequestDispatcher("sys.jsp").forward(req, resp);
		} else {
			// 保存
			save(req, resp);
		}

	}

	/**
	 * 保存的操作
	 * 
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void save(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		ISysService sysService = new SysServiceImpl();

		String user_min_one = req.getParameter("user_min_one");
		String user_max_one = req.getParameter("user_max_one");

		Sys sys_one = new Sys();
		sys_one.setUser_min(Integer.parseInt(user_min_one));
		sys_one.setUser_max(Integer.parseInt(user_max_one));
		sysService.update(sys_one);

		req.setAttribute("msg", "系统设置保存成功！");
		req.getRequestDispatcher("success.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
