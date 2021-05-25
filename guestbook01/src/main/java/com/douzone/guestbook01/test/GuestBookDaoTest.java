package com.douzone.guestbook01.test;

import java.text.ParseException;
import java.util.List;

import com.douzone.guestbook01.dao.GuestBookDao;
import com.douzone.guestbook01.vo.GuestBookVo;

public class GuestBookDaoTest {
	
	public static void main(String[] args)    {
		//insert();
		findAll();

	}

	private static void findAll()  {
		
		try {
			List<GuestBookVo> list = new GuestBookDao().findAll();
			System.out.println(list.size());
			for(GuestBookVo vo : list) {
				System.out.println(vo);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	private static void insert() {
	
	}
}