package curs1;

public class MyfirstClass {

	String nume = "Razvan ";//variabila de instanta
	int age = 23;
	
	
	public static void main(String[] args) {
		
		MyfirstClass obj = new MyfirstClass();
		
		System.out.println("Salut " + obj.nume + obj.age);
	}

}
