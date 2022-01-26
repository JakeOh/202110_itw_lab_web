package edu.spring.ex02.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.spring.ex02.domain.Board;
import edu.spring.ex02.persistence.BoardDao;

@Service // 스프링 컨테이너(프레임워크)가 서비스 컴포넌트로 생성하고 관리하기 위해서.
public class BoardServiceImpl implements BoardService {
	private static final Logger log = LoggerFactory.getLogger(BoardServiceImpl.class);
	
	// Service 계층은 Persistence(Repository) 계층의 객체를 주입(injection)받아서 사용.
	@Autowired private BoardDao boardDao;

	@Override
	public List<Board> select() {
		log.info("select() 호출");
		
		return boardDao.read();
	}

}
