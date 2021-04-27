
class CastingTest1 {
	public static void main(String[] args) {
		MyCar car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe; // car = (Car)fe; 형변환
		// car.water();
		fe2 = (FireEngine) car; // 자손타입 <- 조상타입
		fe2.water();
	}
}

class MyCar {
	String color;
	int door;

	void drive() {// 운전기능
		System.out.println("drive");
	}

	void stop() {// 멈추는 기능
		System.out.println("stop");
	}
}

class FireEngine extends MyCar { // 소방차
	void water() {// 물을 뿌리는 기능
		System.out.println("water");
	}

}
