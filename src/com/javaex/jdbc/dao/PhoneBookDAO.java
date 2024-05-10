package com.javaex.jdbc.dao;

import java.util.List;

public interface PhoneBookDAO {

	public List<PhoneBookVO> getList();
    public PhoneBookVO get(String name);
    public boolean insert(PhoneBookVO pvo);
    public boolean update(PhoneBookVO pvo);
    public boolean delete(String name);
}