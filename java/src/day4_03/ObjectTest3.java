package day4_03;

import lombok.*;

@Getter
@AllArgsConstructor
@ToString
class 제품 {
	private String name;
	private int price;
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof 제품)==false) {
			return false;
		}
		제품 target = (제품)obj;
		return this.name.equals(target.getName()) && this.price==target.getPrice();
	}
}

public class ObjectTest3 {
	public static void main(String[] args) {
		제품 p1 = new 제품("컵누들", 1500);
		제품 p2 = new 제품("신라면", 1500);
		제품 p3 = new 제품("컵누들", 1500);
		
		// ==로 비교하면 무조건 false
		System.out.println(p1.equals(p2));
		System.out.println(p1==p2);
		
		// ==로 비교하면 무조건 false
		System.out.println(p1.equals(p3));
		System.out.println(p1==p3);
	}
}