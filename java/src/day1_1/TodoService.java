package day1_1;

import java.util.ArrayList;

public class TodoService {

	// 데이터베이스 대신 ArrayList
	private ArrayList<Todo> list = new ArrayList<>();

	// 작업하는 메소드는 거의 다 void다.

	// 할일 추가
	public void save(Todo todo) {
		list.add(todo);

	}

	// 할일 목록
	public ArrayList<Todo> findAll() {
		return list;
	}

	// 마이바티스 db 프레임워크에서 save, delete, update의 결과는 정수 
	// 할일 삭제 - 왜 결과값이 long인가? 
	public long delete(Long tno) {
		for (Todo t : list) {
			if (t.getTno() == tno) {
				// 인덱스로 삭제 또는 객체로 삭제
				list.remove(t);
				return 1L;
			}
		}
		return 0L;
	}

	// 할일 변경
	public Long change(Long tno) {
		for(Todo t:list) {
			if(t.getTno()==tno) {
				t.setFinish(!t.getFinish());
				return 1L;
			}
		}
		return 0L;
	}
}
