package InnerEx;

class InnerEx1 {//외부 클래스
	class InstanceInner {//인스턴스 내부 클래스
		int iv = 100;
		// static int cv = 100;//static 변수 선언 불가
		final static int CONST = 100; // final static 은 가능
	}

	static class StaticInner {//스태틱 내부 클래스
		int iv = 200;
		static int cv = 200;// static 클래스만 static 멤버 정의 가능
	}

	void myMethod() {
		class LocalInner {//지역 내부 클래스
			int iv = 300;
			// static int cv = 300;//에러 static 변수 선언 불가
			final static int CONST = 300; // final static 은 상수이므로 허용
		}
	}

	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
}
