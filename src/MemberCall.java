class MemberCall {
	int iv = 10;// 인스턴스 변수
	static int cv = 20; // 클래스 변수

	int iv2 = cv;
	static int cv2 = new MemberCall().iv;// 객체를 생성해야 사용가능

	static void staticMethod1() {
		System.out.println(cv);
		// System.out.println(iv); //클래스메서드에서 인스턴스 변수 사용불가
		MemberCall c = new MemberCall();
		System.out.println(c.iv);// 객체를 생성한 후에 인스턴스변수의 참조가능
	}

	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);// 인스턴스메서드에서는 인스턴스변수를 (객체생성없이) 바로 사용가능
	}

	static void staticMethod2() {
		staticMethod1();
		// instanceMethod1(); //클래스메서드에서는 인스턴스 메서드 호출 불가
		MemberCall c = new MemberCall();
		c.instanceMethod1();// 인스턴스를 생설한 후에야 호출가능
	}

	void instanceMethod2() {// 인스턴스메서드에서는 인스턴스메서드와 클래스메서드
		staticMethod1();// 모두 인스턴스 생성없이 호출 가능
		instanceMethod1();
	}
}
