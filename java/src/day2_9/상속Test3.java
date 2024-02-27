package day2_9;

// 상속의 활용 
class Parent {
	int a;
}

class Child extends Parent {
	int b;
}

public class 상속Test3 {
	public static void main(String[] args) {
// 1. 부모의 참조변수는 자식을 가리킬 수 있다.
// ob1은 Child 자체를 아닌 Child 내부의 Parent를 가리킨다. 
//		Child 안에 Parent가 들어있다. Parent ob1은 Child 안에 있는 parent를 가리킨다. 	
		Parent ob1 = new Child();

		System.out.println(ob1.a);
		
		//System.out.println(ob1.b);

		// 역은 불가능
		//Child ob2 = new Parent();

		// 왜. 부모로 자시을 가리키지? 다음 예제에서
		
		// list는 ArrayList의 부모다. 	
		
		
		Child ob2 = new Child();

		
		
	}
}