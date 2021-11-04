package fr.algorithmie;

/**
 * somme de 2 tableaux
 * 
 * @author denis
 *
 */

public class SommeDeTableaux {

	public static int[] sommeDesTableaux(int[] tableau1, int[] tableau2, int longueurTableaux) {

		int[] tableauSomme = new int[longueurTableaux];
		int indexMax = longueurTableaux - 1;
		for (int i = 0; i <= indexMax; i++) {
			tableauSomme[i] = tableau1[i] + tableau2[i];
		}
		return tableauSomme;

	}

	public static void main(String[] args) {
		int[] tableau1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int longueurTableau1 = tableau1.length;
		int[] tableau2 = { -1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1 };
		int longueurTableau2 = tableau2.length;
		int[] sommeTableau = new int[longueurTableau1];

		if (longueurTableau1 == longueurTableau2) {
			System.out.println("la longueur des tableau est : " + longueurTableau1);
			sommeTableau = sommeDesTableaux(tableau1, tableau2, longueurTableau1);
			for (int i = 0; i < longueurTableau1; i++) {
				System.out.println("tableau somme index: " + i + " element : " + sommeTableau[i]);
			}

		} else {
			System.out.println("attention, les 2 tableaux ont des longueurs differentes !");
			System.out.println("longueur1 = " + longueurTableau1);
			System.out.println("longueur2 = " + longueurTableau2);
		}

	}

}
