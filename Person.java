package Java2021_11_05_Generate;

public class Person {

	int age;
	String name;
	String home;
	
	//생성자
	public Person(int age, String name, String home) {
		this.age = age;
		this.name = name;
		this.home = home;
		
		System.out.println(name + "사람이 태어났습니다.");
	}
	
//	public void setData(int age, String name, String home) {
//		this.age = age;
//		this.name = name;
//		this.home = home;
//		// this는 클래스로 만들어진 객체 그 자신을 의미
//	}
	
}
