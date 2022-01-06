package edu.web.intro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet(name = "firstServlet", urlPatterns = { "/first" })
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() { // 생성자
        super(); // 부모 클래스(HttpServlet)의 기본 생성자(default constructor)를 명시적으로 호출. 
        // subclass의 생성자에서 superclass의 생성자를 명시적으로 호출하지 않는 경우에는,
        // superclass의 기본 생성자가 자동으로 호출됨!
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override // 부모 클래스(HttpServlet)의 클래스 doGet 메서드를 override(재정의).
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
    	System.out.println("firstServlet.doGet() 메서드 호출");
    	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
    	System.out.println("firstServlet.doPost() 메서드 호출");
    	doGet(request, response);
	}

}
