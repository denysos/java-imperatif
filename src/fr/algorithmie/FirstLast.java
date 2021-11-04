package fr.algorithmie;

public class FirstLast {

	final static boolean testTableauFirstLast(int[] tableau) {
		int longueurTableau = tableau.length;
		if (longueurTableau > 0) {
			if ((tableau[0] == tableau[longueurTableau - 1])) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[] tableau1 = { 6, 1, 2 };
		int[] tableau2 = { 6, 1, 6 };
		int[] tableau3 = {};
		int[] tableau4 = { 1, 2 };

		System.out.println("test tableau1 : " + testTableauFirstLast(tableau1));
		System.out.println("test tableau2 : " + testTableauFirstLast(tableau2));
		System.out.println("test tableau3 : " + testTableauFirstLast(tableau3));
		System.out.println("test tableau4 : " + testTableauFirstLast(tableau4));

	}
}
