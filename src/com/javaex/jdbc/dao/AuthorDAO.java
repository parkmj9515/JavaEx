package com.javaex.jdbc.dao;

import java.util.List;

public interface AuthorDAO {
	// LIST = select
	public List<AuthorVO> getList();	// 전체목록 
	public AuthorVO get(Long id);				// PK로 객체 찾기
	public boolean insert(AuthorVO authorVo);	// 레코드 삽입
	public boolean delete(Long id);				// PK로 객체 삭제
	public boolean update(AuthorVO authorVo); // 레코드 갱신
}

