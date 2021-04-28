import java.util.*;

class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		MyTv tv = new MyTv();
		Computer com = new Computer();
		Audio audio = new Audio();

		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}
}

class MyProduct {
	int price; // 제품의 가격
	int bonusPoint;// 제품구매 시 제공하는 보너스 점수

	MyProduct(int price) {
		this.price = price;// 매개변수price를 인스턴스변수에 대입
		bonusPoint = (int) (price / 10.0);// 보너스점수는 제품가격의 10%
	}

	MyProduct() {
		price = 0;
		bonusPoint = 0;
	}// 기본 생성자
}

class MyTv extends MyProduct {
	MyTv() {
		// 조상클래스의 생성자 Product(int price)를 호출
		super(100);// Tv가격을 100
	}

	// Object 클래스의 toString()을 오버라이딩
	public String toString() {
		return "Tv";
	}
}

class Computer extends MyProduct {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends MyProduct {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

class Buyer {// 구매자
	int money = 1000; // 소유금액
	int bonusPoint = 0; // 보너스점수
	Vector item = new Vector(); // 구입한 제품을 저장하는 Vector객체

	void buy(MyProduct p) {
		if (money < p.price) { // 잔액 검사
			System.out.println("잔액 부족");
			return;
		}
		money -= p.price; // 가진 돈에서 가격을 뺌
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수 추가
		item.add(p);// 구입한 제품을 Vector에 저장한다
		System.out.println(p + "을/를 구매하셨습니다");
	}

	void refund(MyProduct p) {// 구입한 제품을 환불한다
		if (item.remove(p)) {// 제품을 Vector에서 제거
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다");
		} else {// 제거에 실패한 경우
			System.out.println("구입하신 제품 중 해당 제품이 없습니다");
		}

	}

	void summary() { // 구입한 물품에 대한 정보를 요약
		int sum = 0; // 구입한 물품의 가격합계
		String itemList = ""; // 구입한 물품 목록

		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다
		for (int i = 0; i < item.size(); i++) {
			MyProduct p = (MyProduct) item.get(i);// Vector의 i번째에 있는 객체를 얻어온다
			sum += p.price;
			itemList += (i == 0) ? "" + p : ", " + p;

		}

		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다");
		System.out.println("구입하신 제품은 " + itemList + "입니다");
	}

}