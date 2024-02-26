package day1_2;

import java.util.ArrayList;

public class GuestBookService {
	private ArrayList<GuestBook> list = new ArrayList<>();
	
	// 저장
	public void save(GuestBook guestbook) {
		list.add(guestbook);
	}
	
	//findAll()
	public ArrayList<GuestBook> findAll(){
		return list;
	}
	
	public GuestBook findByld(Long gno) {
		for(GuestBook g : list) {
			if(g.getGno() == gno) {
				return g;
			}
		}
		return null;
	}
	
	public long delete(Long gno) {
		for(GuestBook g : list) {
			if(g.getGno() == gno) {
				list.remove(g);
				return 1L;
			}
		}
		return 0L;
	}
	
}
