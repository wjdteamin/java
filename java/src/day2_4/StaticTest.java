package day2_4;

class Calc {
	public static int sum(int a, int b) {
		return a+b;
	}
	public static  int sub(int a, int b) {
		return a-b;
	}
}
public class StaticTest{
	public static void main(String[] args) {
		Calc c1 = new Calc();
		Calc c2 = new Calc();
		
		// 객체를 만든다. -> 두 객체는 달라야한다. 
		// c1.sum(2,5);    c2.sum(2,5);
		// c1, c2의 객체는 동작은 항상 같다. -> static으로 가자
		// 항상 값이 같다. 그래서 같은 것을 또 만들 필요가 없다. 
		
		System.out.println(Calc.sum(3, 4));
	}
}