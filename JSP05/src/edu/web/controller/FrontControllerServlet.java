package edu.web.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontControllerServlet
 */
@WebServlet(
		name = "frontControllerServlet", 
		urlPatterns = { "", "/board/*", "/user/*" }
		)
public class FrontControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontControllerServlet() {}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// WAS(Web Application Server)가 서블릿(Servlet) 클래스 객체를 생성할 때 한 번 호출하는 메서드.
		// 서블릿 객체가 생성될 때 필요한 초기화 작업(환경 설정) 등을 담당.
		// TODO
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// 클라이언트에서 요청이 올 때마다 요청을 처리하고 응답을 보내기 위해서 WAS가 호출하는 메서드.
		System.out.println("frontControllerServlet.service() 메서드 호출");
		
		// 요청 파라미터(request parameter)에 포함되어 있는 한글을 처리하기 위해서
		request.setCharacterEncoding("UTF-8");
		
		// request 객체가 가지고 있는 정보들
		// URL: 프로토콜(protocol) + 서버 주소(이름) + 포트번호 + URI(Context Path + 하위 주소 + Query String)
		StringBuffer url = request.getRequestURL();
		System.out.println("Request URL: " + url);
		
		String uri = request.getRequestURI();
		System.out.println("Request URI: " + uri);
		
		String contextPath = request.getContextPath();
		System.out.println("Context Path: " + contextPath);
		
		// 요청을 이동(forward, redirect)
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
