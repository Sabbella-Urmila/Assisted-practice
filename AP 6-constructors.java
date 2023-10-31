package javaprograms;

public class ConstructorDemo {
	public  ConstructorDemo() {
		System.out.println("this is default constructor");
	}
	public  ConstructorDemo(int a) {
		System.out.println("this is parameterized constructor");
		System.out.println("the value of variable a :" +a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo obj =new ConstructorDemo();
		ConstructorDemo obj2 =new ConstructorDemo(10);
		

	}

}
