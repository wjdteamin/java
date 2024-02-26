package day1_1;

import java.time.LocalDate;

// 테스트 클래스 : main 대신

public class TodoTest {
	

	public void test1() {
		// 정수 리터럴의 타입? int
		// Todo t1 = new Todo(1, "작업1", LocalDate.now(), false); ->  Long으로 선언했을 경우 에러남 
		
		// 객체 생성을 담당하는 메소드 : 생성자(constructor)
		// 생성자는 new할 때만 호출된다. 
		Todo t1 = new Todo(1L, "작업1", LocalDate.now(), false);
		
	}
}
