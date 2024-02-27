package day2_9;

// 상속 : 부모 것은 내 것 
class 부모1 {
	int 부모재산 = 1000000;
}

class 자식1 extends 부모1{
	int 자식재산 = 50000;
}

public class 상속Test {
	public static void main(String[] args) {
		자식1 ob = new 자식1();
	 System.out.println(ob.부모재산);
	 System.out.println(ob.자식재산);
	}
}