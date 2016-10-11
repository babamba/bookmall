package com.bit2016.bookmall.main;

import java.util.List;

import com.bit2016.bookmall.dao.BookDao;
import com.bit2016.bookmall.dao.CategoryDao;
import com.bit2016.bookmall.vo.BookVo;
import com.bit2016.bookmall.vo.CategoryVo;

public class BookMall {

	public static void main(String[] args) {
		
		CategoryDao dao = new CategoryDao();
		
		List<CategoryVo> list = dao.getList();
		
		for(CategoryVo vo : list){
			System.out.println(vo);
		}
		
		BookDao dao2 = new BookDao();
		
		List<BookVo>list2 = dao2.getList();
		
		for(BookVo vo : list2){
			System.out.println(vo);
		}
		
		
		
	}

}
