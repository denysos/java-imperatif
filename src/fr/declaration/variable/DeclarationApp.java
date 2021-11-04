package fr.declaration.variable;

public class DeclarationApp {
	public static void main(String[] args){
	byte unOctet = 25;
	short compteurMax = 1000;
	int compteurPlusLongMax = 500_000_001  ;
	long compteurTresTresLongMax = 50_000_000_002L;
	float resultatReel = 100.5F;
	double resultatReelEnorme = 1_000.9D;
	char caractere = 'c';
	boolean finDeFichier = false ;
	int b = 057; // declaration en base 8 octal !!!!
	int bhexa = 0xFFA3; //  notation hexa !
	double num = 7;
	double denom = 8;
	double result = num / denom;
	String messageSympa = "salut les amis";
	String randomString = "Voici le resultat d'un calcul :\n1+5=6";
	System.out.println("voici une variable : " + "\"messageSympa : \"" + messageSympa);
	System.out.println(randomString);
    System.out.println(unOctet);
    System.out.println(compteurMax);
    System.out.println(compteurPlusLongMax);
    System.out.println(b);
    System.out.println(result);
    
}
}
