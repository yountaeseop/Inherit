package Java2021_11_05_Generate;

public class Generate {

	public static void main(String[] args) {
		
		// 객체만드는게 손에 익을 정도로 연습해야함
		
		// 변수에 값을 넣는 것 => 초기화
//		int a = 10;
//		
//		// 객체 초기화
//		Person p1 = new Person();
//		
////		p1.name = "홍길동";
////		p1.age = 20;
////		p1.home = "대전"; // setData를 이용하면
//						// 더 편리하게 바꿀수있다.
//		
//		p1.setData(20, "홍길동", "대전");
//	
//// ----------------------------------------		
//		
//		Person p2 = new Person();
//		
////		p2.name = "홍길순";
////		p2.age = 22;
////		p2.home = "서울";
//		
//		p2.setData(22, "홍길순", "서울");
//		
//		
//		System.out.println(p1.name);
//		System.out.println(p2.name);
		
//------------------------------------		
		Person p1 = new Person(22, "홍길동", "대전");
		System.out.println(p1.name);
		Person p2 = new Person(23, "홍길순", "서울");
		System.out.println(p2.name);
		
	}

}
