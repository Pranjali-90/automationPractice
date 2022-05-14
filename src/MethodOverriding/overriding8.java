package MethodOverriding;

class Parent4 {
	static void m1() {
		System.out.println("static method1");
	}

	void m2() {
		System.out.println("Parent m2");
	}
}
class child4 extends Parent4 {
	static void m1() {
		System.out.println("method 1");
	}

	void m2() {
		System.out.println("method 2");
	}
}

public class overriding8 {
public static void main(String[] args) {
	Parent4 p1=new child4();
	//Parent4.m1();

	p1.m1();
	//overriding works n childs m2() is called
	p1.m2();
	}
}
