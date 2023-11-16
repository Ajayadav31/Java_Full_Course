package threading;

import java.util.Scanner;

class DenominatorNegative extends Exception{
	@Override
	public String toString() {
		return "Denominator can't be negative";
	}
	@Override
	public String getMessage() {
		return "please enter positive number";
	}
}

class DenominarorIsZero extends Exception{
	@Override
	public String toString() {
		return "Denominator can't be zero";
	}
	@Override
	public String getMessage() {
		return "please enter greater than zero number";
	}
}

public class TryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean valid = false;
		
		while(!valid) {
		System.out.println("Enter Numenator : ");
		int a = sc.nextInt();
		System.out.println("Enter DEnominator : ");
		int b = sc.nextInt();
		if(b<0) {
		try {
			throw new DenominatorNegative();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
				}
		else if(b==0) {
			try {
				throw new DenominarorIsZero();
			}
			catch(Exception e){
				System.out.println(e.getMessage());
				System.out.println(e.toString());
			}
		}
		else {
			System.out.println("Division is : " + a/b);
			valid = true;
		}
		}	
	}
}
