package day2_2;

import lombok.Getter;
import lombok.Setter;

// 데이터를 저장하는 클래스 : Entity
// 			필드 + 게터, 세터 + 생성자....
// 		데이터를 처리하는 클래스 : 알아서 만들자.

@Getter
@Setter
public class MyDate2 {
	// 년, 월, 일 필드 추가 
	// 정보은닉을 한다. -> private 
	
	// 1. 필드를 결정 
	// 2. 정보은닉 -> 외부에 마음대로 읽고 쓸 수 없다. 
	// 3.  Getter(읽는 것이다.),  Setter(변경) 
	// 4. 생성자 -> 최소한 2개 
	private Long year;
	private Long month;
	private Long day;
	
	public MyDate2() {
		// 기본 생성자 : 인자 없는 생성자
	}
	public MyDate2(Long year, Long month, Long day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
}