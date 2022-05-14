package MethodOverriding;

//final methods cannot be overridden
class Parent3 {
	Parent3() {
		System.out.println("i am constructor of parent class");
	}

	// Can't be overridden
	final void show() {
		System.out.println("I am final method of Parents class");
	}

	void display() {
		System.out.println("I am  method of Parents class");
	}
}

class child3 extends Parent3 {
	int id = 9;
	double rate = 79.50;

	child3() {
		this(7);
		System.out.println("i am constructor of child class");
	}

	child3(int id) {
		super();
		System.out.println("things id" + id);
	}

	void display() {
		super.display();
		System.out.println("things id: " + id);
		System.out.println("things rate: " + rate);
	}
	void display(int id,double rate) {
		System.out.println("things id: " + id);
		System.out.println("things rate: " + rate);
		System.out.println("things id: " +this. id);
		System.out.println("things rate: " + this.rate);
	}
}
class overriding7{
	public static void main(String[] args) {
		child3 c3=new child3();
		c3.display();
		c3.display(5,100.9);
		Parent3 p1=new child3();
		System.out.println("********************************");
		p1.display();
		}
}