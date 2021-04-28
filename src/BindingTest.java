class BindingTest {
	public static void main(String[] args) {
		MyParent p = new MyChild();
		MyChild c = new MyChild();

		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println();

		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class MyParent {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class MyChild extends MyParent {
	int x = 200;

	void method() {
		System.out.println("x= " + x); // this.x
		System.out.println("super.x=" + super.x);
		System.out.println("this.x=" + this.x);

	}
}
