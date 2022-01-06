package edu.web.intro;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForwardTestServlet
 */
// Servlet 클래스는 처리할 수 있는 URL 패턴을 매핑시켜야 함.
// URL 패턴 매핑 방법 1: @WebServlet 어노테이션(annotation)을 이용.
// URL 패턴 매핑 방법 2: 배포 관리자(deployment descriptor, web.xml)에서 설정.
public class ForwardTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForwardTestServlet() {}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("forwardTestServlet.doGet() 메서드 호출");
		
		// 전달받은 요청(request)을 JSP 페이지에게 재전송(forward)
		RequestDispatcher dispatcher = request.getRequestDispatcher("forward.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
	}

}
