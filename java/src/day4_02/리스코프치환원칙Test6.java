package day4_02;

/*
	객체지향 설계원칙 SOLID 중 앞 3가지
	- 단일 책임 원칙(Single Responsibility Principle)
		객체는 한가지 역할만 담당해야 한다
	- 개방 폐쇄 원칙(Open-Closed Principle)
		개선에 대해서는 열려있고 변경에 대해서는 닫혀있어야 한다 
	- 리스코프 치환 원칙
		부모와 자식은 언제나 치환가능해야 한다 -> 부모와 자식은 똑같이 생겨야 한다
 
*/

class 부모 {
	public void 오버라이드메소드() {
		System.out.println("난 어차피 실행안되요");
	}
}
class 자식 extends 부모 {
	public void 오버라이드메소드() {
		System.out.println("자식의 메소드가 실행됩니다");
	}
	
	public void 자식의메소드() {
		System.out.println("접근이 안되네요");
	}
}
public class 리스코프치환원칙Test6 {
	public static void main(String[] args) {
		자식 ob = new 자식();
		ob.오버라이드메소드();
		ob.자식의메소드();
		
		// 자식 참조변수를 부모로 치환하면
		부모 ob2 = new 자식();
		ob2.오버라이드메소드();
		ob2.자식의메소드();
		
		// 자식의메소드에는 접근이 안된다 -> 치환이 안된다
		// 부모와 자식이 항상 치환가능해야한다는 말은
		// 		자식은 부모의 메소드를 오버라이드만 해야 한다
		//		자식만의 독자적인 메소드를 가져서는 안된다는 말!!!!!!
	}
}