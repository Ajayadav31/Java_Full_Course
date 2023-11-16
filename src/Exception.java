import java.util.Scanner;

public class Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks[] = {1,2,3};
		boolean valid = true;
		while(valid) {
		System.out.println("ENter index number");
		int a = sc.nextInt();
		System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();
		try {
			System.out.println(marks[a]/number);
			valid = false;
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException occured!");
            System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }
        
		}
		
	}
}
