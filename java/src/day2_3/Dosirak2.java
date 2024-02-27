package day2_3;


import day2_2.MyDate2;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


// 도시락 : 제품명, 가격, 날짜
// 도시락 클래스는 String, Long, MyDate2 객체를 사용한다. 
// -> 도시락 String, Long, MyDate2에 "의존한다." or "dependency"가 있다.

// 객체와 객체의 관계
// A가 B를 사용한다. -> HAS_A 관계, 의존관계
// A가 B를 상속한다. -> IS_A 관계

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Dosirak2 {
	String name;
	@Setter
	Long price;
	MyDate2 productDay;
	// 클래스에 Getter나 Setter를 붙이면 전체를 읽고 수정이 가능하지만 객체에 직접 넣으면 그 객체만 가능하다.

}