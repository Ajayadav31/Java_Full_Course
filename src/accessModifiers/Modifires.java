package accessModifiers;
import oops.AccessModifiers;

class c1 extends AccessModifiers {
	public void meth() {
		System.out.println("Hello");
	}
}

public class Modifires {
	public static void main(String[] args) {
		AccessModifiers acc = new AccessModifiers();//able to access public class in different package
	//	acc.meth1();   //default
		acc.meth2();	//public
	//  acc.meth3();	//protected
	//	acc.meth4();	//private
	//	class1 c1 = new class1();//can't access default class in different package
		c1 c = new c1();
	//	c.meth1();
		c.meth2();
	//	c.meth3();
	//	c.meth4();
		c.setProperty1(1);
		System.out.println(c.getProperty1());
		c.setProperty2(2);
		System.out.println(c.getProperty2());
		c.setProperty3(3);
		System.out.println(c.getProperty3());
		c.setProperty1(4);
		System.out.println(c.getProperty4());
	}

}
