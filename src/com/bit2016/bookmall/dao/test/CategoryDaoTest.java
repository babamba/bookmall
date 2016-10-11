package com.bit2016.bookmall.dao.test;

import com.bit2016.bookmall.dao.CategoryDao;
import com.bit2016.bookmall.vo.CategoryVo;

public class CategoryDaoTest {
	public static void main(String[] args) {
		
		//insert test
		insertTest();
		
		
	}
	
	
	public static void insertTest(){
		
		CategoryDao dao = new CategoryDao();
		
		CategoryVo vo1 = new CategoryVo();
		vo1.setName("컴퓨터/IT");
		dao.insert(vo1);
		
		CategoryVo vo2 = new CategoryVo();
		vo2.setName("경제");
		dao.insert(vo2);
		
	}
	
	
	
}
