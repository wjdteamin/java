package day4_03;

import lombok.*;

@Getter
@AllArgsConstructor
@ToString
class Apple {
	private String name;
	private int price;
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Apple)==false) {
			return false;
		}
		Apple target = (Apple)obj;
		return this.price==target.getPrice();
	}
}

public class ObjectTest4 {
	public static void main(String[] args) {
		Apple a1 = new Apple("대구 사과", 3500);
		Apple a2 = new Apple("경북 능금", 3500);

		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
	}
}