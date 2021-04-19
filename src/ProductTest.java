class Product {
	static int count = 0;// 생성된 인스턴스의 수를 저장하기 위한 변수 //클래스 변수 명시적 초기화
	int serialNo; // 인스턴스 고유 번호//인스턴스 변수 명시적 초기화
	{// 인스턴스 초기화 블럭
		++count;
		serialNo = count;
	}

	public Product() {
	} // 기본 생성자, 생략가능
}

class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();

		System.out.println("p1의 serial no는 " + p1.serialNo);
		System.out.println("p2의 serial no는 " + p2.serialNo);
		System.out.println("p3의 serial no는 " + p3.serialNo);
		System.out.println("생상된 제품의 수는 모두 " + Product.count + "개 입니다");
	}

}
