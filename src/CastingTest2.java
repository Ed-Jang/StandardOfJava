
class CastingTest2 {
	public static void main(String[] args) {
		MyCar car = new MyCar();
		MyCar car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car;//실행시 에러, 조상타입의 인스턴스를 자손타입의 참조변수로 참조하는 것은 안됨
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}
