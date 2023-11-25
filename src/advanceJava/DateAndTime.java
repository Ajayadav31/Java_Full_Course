package advanceJava;

public class DateAndTime {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());					//Milliseconds
		System.out.println(System.currentTimeMillis()/1000);			//seconds
		System.out.println(System.currentTimeMillis()/1000/3600);		//minutes
		System.out.println(System.currentTimeMillis()/1000/3600/24);	//days
		System.out.println(System.currentTimeMillis()/1000/3600/24/365);//years
	}

}
