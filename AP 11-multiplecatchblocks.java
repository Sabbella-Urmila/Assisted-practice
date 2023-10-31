package exceptionpractices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner -->
		Scanner scan =new Scanner(System.in);
		try {
		System.out.println("enter a number");
		int num1=scan.nextInt();
		System.out.println("enter  another number");
		int num2=scan.nextInt();
		int result=num1/num2;
		System.out.println("division of two numbers is: " +result);
		}
		catch(ArithmeticException e) {
			System.out.println("please donot enter zero in denominator");
		}
		catch(InputMismatchException e) {
			System.out.println("please enter only integer values");
		}
		catch(Exception e) {
			System.out.println("please enter valid input");
		}
		
		

	}

}
