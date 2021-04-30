package RepairableTest;

class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();// Tank생성
		Dropship dropship = new Dropship();// Dropship 생성

		//Marine marine = new Marine();// Marine 생성
		SCV scv = new SCV();// SCV생성
		scv.repair(tank); // scv가 tank수리
		scv.repair(dropship);
		//scv.repair(marine);//marine은 Repairable을 구현하지 않음

	}
}

interface Repairable {
}

class Unit {
	int hitPoint;
	final int MAX_HP;

	Unit(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);// HP150
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable {
	Dropship() {
		super(125);// HP125
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Dropship";
	}
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}

	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit) r;
			while (u.hitPoint != u.MAX_HP) {// MAX가 될때까지 실행
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다");
		}
	}
}
