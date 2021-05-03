package EqualsEx2;

class Person{
	long id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			//Person p = new Object(); 아래 코드에서 생략된 것
			return id ==((Person)obj).id; //obj가 Object타입이므로 id값 참조를 위해 Person타입으로 형변환
		}
		else {
			return false; //타입이 Person이 아니면 값을 비교할 필요x
		}
	}
	
	Person(long id){//생성자
		this.id = id;
	}
}


class EqualsEx2 {
	public static void main(String[] args) {
		Person p1 = new Person(801108111222L);
		Person p2 = new Person(801108111222L);
		
		if(p1==p2) {
			System.out.println("p1과 p2는 같은 사람입니다");
		}
		else {
			System.out.println("p1과 p2는 다른 사람입니다");
		}
		
		if(p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람입니다");
		}
		else {
			System.out.println("p1과 p2는 다른 사람입니다");
		}
	}
}
