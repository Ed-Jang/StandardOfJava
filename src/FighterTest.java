
class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter(); //Fighter 객체 생성

		if(f instanceof Unit) { 
			System.out.println("f는 Unit클래스의 자손입니다");
		}
		if (f instanceof Fightable) {
			System.out.println("f는 Fightable인터페이스를 구현했습니다");
		}
		if (f instanceof Movable) {
			System.out.println("f는 Movable인터페이스를 구현했습니다");
		}
		if (f instanceof Attackable) {
			System.out.println("f는 Attackable인터페이스를 구현했습니다");
		}
		if (f instanceof Object) {
			System.out.println("f는 Object클래스의 자손입니다");
		}
	}
}//main

class Fighter extends Unit implements Fightable {//Fightable을 구현하고 Unit을 상속받음
	public void move (int x, int y) {//Fightable -> Movable에 있는 Move메서드를 사용
		
	}
	public void attack(Unit u) {//Fightable -> Attackable에 있는 attack메서드를 사용
		
	}
}

class Unit {//유닛 클래스
	int currentHP; // 유닛의 체력
	int x;
	int y;
}

interface Fightable extends Movable, Attackable {
}//movable과 Attackable을 Fightable 에 구현

interface Movable {//위치값, 움직임
	void move(int x, int y);
}

interface Attackable {//공격기능
	void attack (Unit u);
}