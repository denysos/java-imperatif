package fr.algorithmie;

/**
 * calcul de la moyenne des elements d'un tableau
 * 
 * @author denis
 *
 */

public class CalculMoyenne {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		float somme = 0F;
		float moyenne = 0F;
		int longueurTableau = array.length;
		int indexMax = longueurTableau - 1;

		for (int i = 0; i <= indexMax; i++) {
			somme = somme + array[i];
		}
		moyenne = somme / longueurTableau;
		System.out.println("nombre d'elements du tableau : " + longueurTableau);
		System.out.println("la moyenne des elements du tableau est : " + moyenne);
	}

}
