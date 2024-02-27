package day2_5;

import java.util.ArrayList;

// 처리하는 클래스 -> 객체 생성 X 
public class GuestBookService {
	private static ArrayList<GuestBook> list = new ArrayList<>();

	// staic은 staic끼리 접근할 수 있다.
	public void save(GuestBook gb) {
		list.add(gb);
	}

	public static ArrayList<GuestBook> findAll() {
		return list;
	}

	// 객체를 비교할 때는 ==아니라 equals메소드를 사용한다.
	// 객체를 리턴하는 경우 실패하면 null을 리턴한다.
	public static GuestBook findById(Long gno) {
		for (GuestBook gb : list) {
			if (gb.getGno().equals(gno)) {
				return gb;
			}
		}
		return null;
	}
	public static Boolean delete(Long gno) {
		return false;
	}
}
// 성공 실패를 표시할 때는 Boolean 또는 null로 가져오면 된다 .
// static은 객체에 접근할 수 없다. 구분이 안되기 때문이다. 객체가 여러개 있어서 정확하게 어떤 것을 지정하는지 모르기 때문이다.