package oops;

interface sampleOne{
	public void meth1();
	public void meth2();
}
 //Inheritance use in interface by extends keyword
interface sampleTwo extends sampleOne{
	 public void meth3();
	 public void meth4();
}
//
interface sampleThree{
	void meth5();
}
interface sampleFour{
	void meth6();
}
//using interface can't implements interface
/*
interface sampleFive implements sampleThree {
	 public void meth7() {
		System.out.println("Meth7"); 
	 }
	public void meth5() {
		System.out.println("Meth5");	
	}
}
*/

//but using single/multiple interfaces we can implements class
class SampleFive implements sampleThree,sampleTwo {
	public void meth1() {
		System.out.println("Meth1");	
	}
	public void meth2() {
		System.out.println("Meth2");	
	}
	public void meth3() {
		System.out.println("Meth3");	
	}
	public void meth4() {
		System.out.println("Meth4");	
	}
	public void meth5() {
		System.out.println("Meth5");	
	}
	public void meth7() {
		System.out.println("Meth7"); 
	 }
	
}



public class InheritanceInInterfaces {
	public static void main(String[] args) {
		SampleFive use = new SampleFive();
		use.meth1();
		use.meth2();
		use.meth3();
		use.meth4();
		use.meth5();
		use.meth7();
	}
}
