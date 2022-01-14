package edu.web.controller.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.web.controller.Action;

public class BoardDetailController implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 제목을 클릭했을 때 해당 글 번호(bno)의 모든 내용을 보여주는 페이지
		// 1. request 객체에서 요청 파라미터 bno의 값을 읽음.
		// 2. boardService 객체의 메서드를 호출해서 게시글 내용을 가져옴.
		// 3. request 객체에 Board 객체를 포함시켜서 View(JSP)로 포워드
		
		return "/WEB-INF/board/board-detail.jsp";
	}

}
