package oops;

interface rent{
	 void rentCharge();
	 void duration();
}

interface purchase{
	 void sellingPrice();
}

class House implements rent,purchase{
	public void rentCharge() {
		System.out.println("5000");
	}
	public void duration(){
		System.out.println("For 1 Month");
	}
	public void sellingPrice(){
		System.out.println("10,00000");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		
//		purchase buy = new House();
//		buy.sellingPrice();
		
		rent r = new House();
		r.rentCharge();
		r.duration();
		
	}

}
