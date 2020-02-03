package web;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.People;
import entity.User;
import service.UserService;
import service.impl.UserServiceImpl;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1.
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("Name");
		String sex = request.getParameter("Sex");
		
		String date =request.getParameter("Date");
		String religion = request.getParameter("Religion");
		String country = request.getParameter("Country");
		String email = request.getParameter("Email");
		String password = request.getParameter("Password");
		//date = date.substring(0,4);
		//int age = 2019-Integer.parseInt(date);	
		//System.out.print(age);
		
		//2.1 注册
		User user = new User(name, email,password);
		People people = new People(name, 27,  sex, religion, 
				"汉语", country,
				country,  "本科",  "职员",  "未婚", Date.valueOf(date)) ;
			
		UserService userService = new UserServiceImpl();
		int r = userService.register(user,people);
		if(r == -1){
			request.setAttribute("message1", "该用户已存在");
		} else if(r == 1){
			request.setAttribute("message1", "注册成功");
		} else{
			request.setAttribute("message1", "再试一次");
		}
		
		
		
		//3.
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
