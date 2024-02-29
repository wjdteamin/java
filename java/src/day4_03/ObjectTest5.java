package day4_03;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder

//toString 메소드를 만들어라
//@ToString

//equals 메소드와 hashCode 메소드를 만들어라
//@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor

// 객체의 값을 비교하려면 이퀄스 
// 오버라이드를 하면 ToString, 이퀄스, 그리고 하나 더 있다...? 기억이 나지 않는다. 미안

class 제품 {
	private String name;
	private int price;

	@Override
	public boolean equals(Object obj) {
		// 핸드폰 ob = new 갤럭시();
		// 참조변수 ob가 가리키는 대상이 갤럭시 확인하는 연산자
		// ob instanceof 갤럭시

		// 제품과 제품이 아닌것을 비교하면 무조건 false
		if ((obj instanceof 제품) == false) {
			return false;
		}

		// 이제 obj가 가리키는 대상은 제품인 걸 확인했다.
		// obj를 제품으로 형변환을 한다 : 업캐스트, 다운캐스트
		제품 target = (제품) obj;
		return this.name.equals(target.getName()) && this.price == target.getPrice();
	}

	public class ObjectTest5 {
		public static void main(String[] args) {
			제품 p = new 제품("신라면", 2000);
			System.out.println();
		}
	}
}
