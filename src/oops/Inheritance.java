package oops;

class Base{
	public int x;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		System.out.println("I am in base and setting x now");
		this.x = x;
	}
	public Base() {
		System.out.println("I am a constructer of base class");
	}
}

class Derived extends Base{
	public int y;
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		System.out.println("I am in derived and setting y now");
		this.y = y;
	}
}

public class Inheritance {
	public static void main(String[] args) {
		//creating an object of base class
		/*Base b = new Base();
		b.setX(4);
		System.out.println(b.getX());*/
		
		//creating an object of Derive class
		Derived d = new Derived();
		d.setY(4);
		System.out.println(d.getY());
	}

}
