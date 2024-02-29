package day4_04;

// 추상 메소드 많이 사용하나요?  물 마시듯이 
// 왜 사용하느냐? 오버라이드와 함께
abstract class Parent {
	abstract public void insa();
}

// 추상클래스 Parent를 상속하면 자식도 추상클래스가 된다 .
class 첫째딸 extends Parent {

	@Override
	public void insa() {
		System.out.println("안녕하세요");

	}

}

class 둘째아들 extends Parent {
	public void hello() {
		System.out.println("하이~");
	}
}

public class 추상메소드Test5_1 {
	public static void main(String[] args) {

	}
}

// 표준은 자바 회사 사람들
// 구현 나같은 사람 

// 자바의 모든 클래스는 object의 자식이다. 
// 만약 toString이 추상이면 싹다 빨간색 줄이 나온다. -> 부모에 추상메소드가 들어있다는 의미다.
// 그렇게 하면 에러가 터져나오기 때문에 쓸데없는 것을 넣어서 hasCode 찍게 만들었다.