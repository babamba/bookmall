package com.bit2016.bookmall.dao.test;

import com.bit2016.bookmall.dao.BookDao;
import com.bit2016.bookmall.vo.BookVo;

public class BookDaoTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		insertTest();
	}

	
	public static void insertTest(){
		
		BookDao dao = new BookDao();
		
		BookVo vo = new BookVo();
		vo.setTitle("이것이자바다");
		vo.setPrice(32000L);
		vo.setCategoryNum(1L);
		
		dao.insert(vo);

	}
	
}
