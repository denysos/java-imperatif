package fr.algorithmie;

/**
 * 
 * On calcule une valeur booléenne qui contrôle le tableau de la sorte : elle
 * vaut true si le tableau a au moins 1 élément et si le premier élément ou le
 * dernier élément vaut 6. elle vaut false dans les autres cas
 * 
 * @author denis
 *
 */

public class FirstLast6 {

	final static boolean testTableauFirstLast6(int[] tableau) {
		int longueurTableau = tableau.length;
		if (longueurTableau > 0) {
			if ((tableau[0] == 6) || (tableau[longueurTableau - 1] == 6)) {
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

		System.out.println("test tableau1 : " + testTableauFirstLast6(tableau1));
		System.out.println("test tableau2 : " + testTableauFirstLast6(tableau2));
		System.out.println("test tableau3 : " + testTableauFirstLast6(tableau3));
		System.out.println("test tableau4 : " + testTableauFirstLast6(tableau4));

	}

}
