package day4_04;

import java.util.*;

// 추상 메소드로만 구성된 순수한 설계도를 인터페이스라고 한다
interface Shape {
	abstract void draw();
}

class Circle implements Shape {
	public void draw() {
		System.out.println("원을 그립니다");
	}
}

class Triangle implements Shape {
	public void draw() {
		System.out.println("삼각형을 그립니다");
	}
}

class Rect implements Shape {
	public void draw() {
		System.out.println("사각형을 그립니다");
	}
}

public class 추상메소드Test4 {
	public static void main(String[] args) {
		List<Shape> list = new ArrayList<>();
		list.add(new Circle());
		list.add(new Rect());
		list.add(new Triangle());
		
		for(Shape s:list) {
			s.draw();
		}
	}
}