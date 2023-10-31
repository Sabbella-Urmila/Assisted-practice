package exceptionpractices;

public class ThrowsDemo {
	public void div(int a, int b)throws ArithmeticException{
		//let us assume our arithmetic exception is our custom exception class
		if(b==0) {
			throw new ArithmeticException();
		}
		else {
		int c= a/b;
		
		System.out.println("the div of two numbers:" +c);
		}
	}

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		ThrowsDemo obj=new ThrowsDemo();
		try {
		obj.div(10, 0);
		}
		catch(Exception e){
		System.out.println("further code execution");
		}

	}

}
