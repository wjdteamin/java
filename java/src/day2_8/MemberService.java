package day2_8;

import java.util.*;

public class MemberService {
	private static MemberService service = new MemberService();
	private MemberService() {
	}
	public MemberService getInstance() {
		return service;
	}
	
	private ArrayList<Member> list = new ArrayList<>();
	
	public Boolean 아이디사용가능(String username) {
		for(Member m:list) {
			if(m.getUsername().equals(username)==true) {
				return false;
			}
		}
		return true;
	}
	
	public void 회원가입(Member member) {
		list.add(member);
	}
	
	public String 아이디찾기(String email) {
		for(Member m:list) {
			if(m.getEmail().equals(email)==true) {
				return m.getPassword();
			}
		}
		return null;
	}
	
	public Boolean login(String username, String password) {
		for(Member m:list) {
			if(m.getUsername().equals(username)==true && m.getPassword().equals(password)==true) {
				return true;
			}
		}
		return false;
	}
	
	public Boolean changePassword(String password, String newPassword) {
		for(Member m:list) {
			if( m.getPassword().equals(password)==true) {
				m.setPassword(newPassword);
				return true;
			}
		}
		return false;
	}
}