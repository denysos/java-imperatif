package fr.algorithmie;

import java.util.Arrays;

/**
 * somme de 2 tableaux de longueurs differentes
 * 
 * @author denis
 *
 */

public class SommeDeTableauDiff {

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
		int[] tableau2 = { -1, 12, 17, 14, 5, -9, 0, 18 };
		int longueurTableau2 = tableau2.length;
		int[] sommeTableau = new int[longueurTableau1];

		if (longueurTableau1 <= longueurTableau2) {
			tableau1 = Arrays.copyOf(tableau1, longueurTableau2);
			sommeTableau = sommeDesTableaux(tableau1, tableau2, longueurTableau2);

		} else {
			tableau2 = Arrays.copyOf(tableau2, longueurTableau1);
			sommeTableau = sommeDesTableaux(tableau1, tableau2, longueurTableau1);
		}
		for (int i = 0; i < longueurTableau1; i++) {
			System.out.println("tableau somme index: " + i + " element : " + sommeTableau[i]);
		}

	}

}
