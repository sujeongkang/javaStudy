package com.map.member.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

import com.map.member.model.vo.Member;

public class MemberController {
	private static final String Member = null;
	private HashMap map=new HashMap();
	
	public boolean joinMembership(String id,Member m) {
		if(map.containsKey(id)==true) {
			return false;
		}else {
			
			map.put(id, m);
			return true;
		}
		
	}
//	public String login(String id,String password) {
//		if(map.containsKey(id)==true) {
//			(Member)map.get(id)
//		}
//		Iterator it=memid.iterator();
//		while(it.hasNext()) {
//			Member m=((Member) mep).get(it.next());
//			
//		}
//				
//		return String m.getName;
//	}
//	
//	public boolean changePassword(String id, String oldPw, String newPw) {
//		if((map.containsKey(id))&&(map.containsValue(oldPw))) {
//			if(map.replace(id, oldPw, newPw)) {
//				return true;
//			}
//		}
//		return  false;
//	}
//	public void ChangeName(String id, String newName) {
//		
//			Member m=(Member)map.get(id);
//			m.setName(newName);
//		
//		
//		
//		
//	}
//	public TreeMap sameName(String name) {
//		if(map.containsValue(name)==true) {
//			TreeMap tmap=new TreeMap();
//			
//			
//				
//				
//			
//		}
//	}
}
