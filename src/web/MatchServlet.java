package web;

import java.io.IOException;
import java.util.List;
import java.util.Collections;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.People;
import service.MatchService;
import service.impl.MatchServiceImpl;

/**
 * Servlet implementation class MatchServlet
 */
@WebServlet("/MatchServlet")
public class MatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MatchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1.
		String name = request.getParameter("name");
		//System.out.print(name);
			
		// 2. 
		MatchService matchService = new MatchServiceImpl();
		List<People> peoples = matchService.match(name);
		//∂‘peoples≈≈–Ú
		Collections.sort(peoples);
		request.setAttribute("peoples", peoples);

				
		// 3. 
		//request.setAttribute("people", people);
		request.getRequestDispatcher("match.jsp").forward(request, response);
		
			
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
