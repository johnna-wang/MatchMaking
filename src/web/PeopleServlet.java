package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.People;
import service.PeopleService;
import service.impl.PeopleServiceImpl;

/**
 * Servlet implementation class PeopleServlet
 */
@WebServlet("/PeopleServlet")
public class PeopleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PeopleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1.获取参数
		request.setCharacterEncoding("utf-8");
		String sex = request.getParameter("sex");
		int age1 = Integer.parseInt(request.getParameter("age1"));
		int age2 = Integer.parseInt(request.getParameter("age2"));
		String religion = request.getParameter("religion");
	
		//2.调用业务
		PeopleService peopleService = new PeopleServiceImpl();
		List<People> peoples = peopleService.findbysex_age(sex, age1, age2,religion);
		request.setAttribute("peoples", peoples);

		
		//3.跳转页面
		request.getRequestDispatcher("single.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
