package day4_03;

import lombok.AllArgsConstructor;

/*
 객체의 비교
  	- == 연산자를 객체에 적용하면?
		객체가 같은 객체인지를 비교(해시코드를 비교)
		같은 값을 가지는 객체인지를 비교하는 것이 아니다
	- equals
		객체의 값을 비교할 때 사용하는 메소드로 Object에 정의되어 있다
		클래스 작성자가 오버라이드한다  
*/

public class ObjectTest2 {
	public static void main(String[] args) {
		Product p1 = new Product("노트", 2000);
		Product p2 = new Product("노트", 2000);
		
		if(p1==p2) {
			System.out.println("동일 제품입니다");
		} else {
			System.out.println("다른 제품입니다");
		}
	}
}