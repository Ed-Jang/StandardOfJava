package CardToString;

class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {//Object클래스에서도 public이라서 여기도 public 으로 선언
		return "kind : " + kind + ", number : " + number; //Card인스턴스의 kind와 number를 문자열로 반환
	}
}

class CardToString {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("HEART", 10);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
