package web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import entity.User;
import service.UserService;
import service.impl.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		//1.获取参数（方法1）
		String email = request.getParameter("Email");
		String password = request.getParameter("Password");
		
		System.out.print(email);
		System.out.println(password);
		
		//1.1 方法2		
		Map<String , String[]> map = request.getParameterMap();
		
		User userLogin = new User();		
		
		try {
			System.out.println("USER");
			BeanUtils.populate(userLogin, map);
			System.out.println(userLogin.toString());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//	String email = userLogin.getEmail();
	//	String password = userLogin.getPassword();
		
		
		//2
		UserService userService = new UserServiceImpl();
		User user = userService.login(email, password);
		
		
		HttpSession	session = request.getSession();
		session.removeAttribute("USER");
		if(user != null){
			session.setAttribute("USER", user);
			
		} else{
			request.setAttribute("message", "登录失败");
		}
		
		//3
		request.getRequestDispatcher("IndexServlet")
				.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
