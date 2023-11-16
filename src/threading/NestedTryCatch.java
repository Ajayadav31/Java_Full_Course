package threading;

import java.util.Scanner;

class NuminatorNegative extends Exception{
	@Override
	public String toString() {
		return "MArks can't be negative";
	}
	@Override
	public String getMessage() {
		return "please enter positive marks";
	}
}

class DenominarorIsZero extends Exception{
	@Override
	public String toString() {
		return "Total marks can't be zero";
	}
	@Override
	public String getMessage() {
		return "please enter greater than zero value";
	}
}
class DenominatorIsGreaterThanNuminator extends Exception{
	@Override
	public String toString() {
		return "Total marks smaller than numinator";
	}
	@Override
	public String getMessage() {
		return "please enter correct Total marks";
	}
}
public class NestedTryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean valid = false;
		while(!valid) {
			System.out.println("Enter getted marks");
			float a = sc.nextFloat();
			System.out.println("Total marks : ");
			float b = sc.nextFloat();
			if(a<0) {
				try {
					throw new NuminatorNegative();
				}
				catch(Exception e){
					System.out.println(e.toString());
					System.out.println(e.getMessage());
				}
			}else if(b==0) {
				try {
					throw new DenominarorIsZero();
				}
				catch(Exception e) {
					System.out.println(e.toString());
					System.out.println(e.getMessage());
				}
			}else if(a>b) {
				try {
					throw new DenominatorIsGreaterThanNuminator();
				}
				catch(Exception e) {
					System.out.println(e.toString());
					System.out.println(e.getMessage());
				}
			}
			else {
				System.out.println("Your Percentage is : " + (a/b)*100 + "%");
				valid = true;
			}
		}
		
	}

}
