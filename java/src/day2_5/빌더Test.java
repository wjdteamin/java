package day2_5;

import lombok.Builder;

@Builder
class 아이언맨{
	private String 두뇌;
	private String 팔;
	private String 다리;
	private String 날개;
}
public class 빌더Test {
	public static void main(String[] args) {
		아이언맨 man= 
				아이언맨.builder().날개("만능날개").팔("만능팔").build();
		// 1. 빌더를 사용하면 생성자를 만들지 않아도 사용자는 원하는 값만 지정해서 객체 생성이 가능하다. 
		// 2. 객체를 만들 때 필드의 순서가 헷갈리지 않는다.
		
		// 객체를 만드는 것이 어렵다. 그래서 builder를 사용하는 것이다. 
		
	}
}
