
class CastingTest2 {
	public static void main(String[] args) {
		MyCar car = new MyCar();
		MyCar car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car;//실행시 에러 
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}
