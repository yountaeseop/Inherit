package Java2021_11_05_Generate;

public class Inheritance {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		SuperCar c2 = new SuperCar();
		c2.model = "람보르기니";
		
		
		c2.turbo();
		c2.run();
		
		//자동차인데 추가적인 기능을 가진 새로운 형태의 자동차 도입
		// 자율 주행가능한 자동차
		// 자율주행은 안되지만 고연비기능있는 자동차
		// 터보엔진 기능이 가능한 자동차

	}

}

class Car{
	String model;
	int velo;
	
//	public Car(String model, int velo) {
//		this.model = model;
//		this.velo = velo;
//	}
	
	public void run() {
		
		System.out.println(velo + "km로" + model +"가 달립니다.");
	}
	
}

// 이거는 자동차야
// class Car의 코드를 똑같이 가져와야돼~
// 그러면 어떻게 해야하지...
//class SuperCar extends car 이렇게 하면 된다!!!
// 단, 

// 상속과 재정의에 대해서 더 공부하자!!!!
class SuperCar extends Car {
	
     public void run() {
		
		System.out.println(velo + "km로" + model +"가 달립니다.");
	}
	
	public void turbo() {
		System.out.println("터보모드");
	}
	
	

}



