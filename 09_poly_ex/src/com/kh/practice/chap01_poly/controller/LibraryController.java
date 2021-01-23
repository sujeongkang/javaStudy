package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	private Member mem=null;
	private Book[] bList=new Book[5];
	
	{
		bList[0]=new CookBook("�������� ����","������","tvN",true);
		bList[1]=new AniBook("�ѹ� �� �ؿ�","��Ƽ","�����",19);
		bList[2]=new AniBook("������ ���ǽ�","����","japan",12);
		bList[3]=new CookBook("�������� �󸶳� ���ְԿ�","������","����",false);
		bList[4]=new CookBook("������ �� �����غ�","������","�ұ�å",true);
		
	}
	
	
	public void insetMember(Member mem) {
		this.mem=mem;
		
	}
	public Member myInfo() {
		return this.mem;
	}
	public Book[] selectAll() {
		return bList;
	}
	
	public Book[] searchBook(String key) {
		int count=0;
		Book[]search=new Book[5];
		for(int i=0;i<bList.length;i++) {
			if((bList[i].getTitle()).contains(key)) {
				
				search[count]=bList[i];
				count++;
			
			}
		}
		return search;
		
		
	}
	
	
	public int rentBook(int index) {
		int result=0;
		if((bList[index]instanceof AniBook)&&((AniBook)bList[index]).getAccessAge()>mem.getAge()) {
			result=1; 
			}
		if((bList[index]instanceof CookBook)&&((CookBook)bList[index]).isCoupon()){
			
			mem.setCouponCount(1);
			result=2;
		}
		return result;
	}
}
