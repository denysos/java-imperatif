package fr.algorithmie;

/**
 * affichage de diverses valeurs d'un tableau
 * @author denis
 *
 */


public class AffichagePartiel {

	public static void main(String[] args) {
		System.out.println("affichage partiel d'un tableau :");

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int longueurTableau = array.length - 1;

		System.out.println("affichage entiers superieurs 3");
		for (int i = 0; i < longueurTableau; i++) {

			if (array[i] >= 3) {
				System.out.println("element index : " + i + " egal : " + array[i]);
			}
		}
		System.out.println();
		System.out.println("affichage entiers pairs");
		for (int i = 0; i < longueurTableau; i++) {

			if (array[i] % 2 == 0) {
				System.out.println("element index : " + i + " egal : " + array[i]);
			}
		}

		System.out.println();
		System.out.println("affichage des index pairs");
		for (int i = 0; i < longueurTableau; i++) {

			if (i % 2 == 0) {
				System.out.println("element index : " + i + " egal : " + array[i]);
			}
		}

		System.out.println();
		System.out.println("affichage entiers impairs");
		for (int i = 0; i < longueurTableau; i++) {

			if (array[i] % 2 == 1) {
				System.out.println("element index : " + i + " egal : " + array[i]);
			}
		}

	}
}
