package exemple;
//classe Bonjour

public class Bonjour {
	public static void main(String[] args) {
	String mess = "c'est bon, ca marche !";
	int valeur = 10;
	long b = 300; // L non obligatoire car < 2.1 Milliard
	long bb = 3000000000L;
	float f = 250.5F; 
	
	// conversion implicite : double > float > long > int > short > byte
	// on peut affecter un long dans un float car OK dans la hierarchie des types
		System.out.println("hello, bonjour !! super !!");
		System.out.println(mess);
		System.out.println(valeur);
	}

}
