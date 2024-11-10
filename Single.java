class Parent {
	void cal() {
		System.out.println("Perform Operation");
	}
}

class Test extends Parent {
	public static void main(String args[]) {
		Test test = new Test();
		test.cal();
	}
}
