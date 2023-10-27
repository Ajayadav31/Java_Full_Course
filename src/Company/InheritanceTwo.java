package Company;


//inheritance allows you to create a new class that is based on an existing class.means all code of That class 
//assecele(Depend on access modifier) in new class by using "extends" keyword.

//basic example of inheritance in Java:

class Animal{  //Super Class or parent class
	public String name;
	public int age;
	
	/*public String getName() {
		return name;
	}*/
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class Dog extends Animal{  //Sub Class or child class
	public String owner;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	//set get name or age are accessible from animal class by dog class object 
}

public class InheritanceTwo {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("Tuffy");
		d.setAge(3);
	}
}
