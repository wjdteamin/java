package day4_04;

abstract class Sample{
	// 중괄호 대신 ;을 찍으면 추상 메소드 -> 미구현 메소드
	// 추상메소드가 포함된 클래스 -> 추상 클래스
	public abstract void insa();
}
public class 추상메소드Test5 {
	public static void main(String[] args) {
		// 미완성인 추상 클래스는 객체를 생성할 수 없다.
		Sample s = new Sample();
	}
}

// 상속에서 부모의 역할은 메소드의 이름을 정해주는 것이다. 부모 클래스는 내용이 들어갈 필요가 없다. 그냥 추상메소드만 있으면 된다. 

// override와 추상메소드는 항상 같이 다녀야한다. 
