package oops;

public class AccessModifiers {
	int property1;
	public int property2;
	protected int property3;
	private int property4;
	
	public int getProperty1() {
		return property1;
	}
	public void setProperty1(int property1) {
		this.property1 = property1;
	}
	public int getProperty2() {
		return property2;
	}
	public void setProperty2(int property2) {
		this.property2 = property2;
	}
	public int getProperty3() {
		return property3;
	}
	public void setProperty3(int property3) {
		this.property3 = property3;
	}
	public int getProperty4() {
		return property4;
	}
	public void setProperty4(int property4) {
		this.property4 = property4;
	}
	void meth1(){
		System.out.println("default meth1");
	}
	public void meth2() {
		System.out.println("public meth2");
	}
	protected void meth3() {
		System.out.println("protected meth3");
	}
	private void meth4() {
		System.out.println("private meth4");
	}
}
