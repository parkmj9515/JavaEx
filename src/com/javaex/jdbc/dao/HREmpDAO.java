package com.javaex.jdbc.dao;

import java.util.List;

public interface HREmpDAO {
	public List<HREmpVO> getList();
	public HREmpVO get(String name);
}
