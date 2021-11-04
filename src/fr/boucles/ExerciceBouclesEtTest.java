package fr.boucles;

public class ExerciceBouclesEtTest {

	public static void affichageElementsDuTableau(int[] tab) {
		int iMax = tab.length - 1;

		System.out.println("affichage des elements du tableau dans l'ordre :");
		for (int i = 0; i <= iMax; i++) {
			System.out.println("index " + i + " : " + tab[i]);
		}
		System.out.println();

	}

	public static void affichageElementsDuTableauOrdreInverse(int[] tab) {
		int iMax = tab.length - 1;

		System.out.println("affichage des elements du tableau dans l'ordre inverse :");

		for (int i = iMax; i >= 0; i--) {
			System.out.println("index " + i + " : " + tab[i]);
		}
		System.out.println();
	}

	public static void affichageElementsDuTableauSuperieur3(int[] tab) {
		int iMax = tab.length - 1;

		System.out.println("affichage des elements du tableau supérieurs à 3 :");

		for (int i = 0; i <= iMax; i++) {
			if (tab[i] >= 3) {
				System.out.println("index " + i + " : " + tab[i]);
			}
		}
		System.out.println();
	}

	public static void affichageElementsDuTableauEntiersPairs(int[] tab) {
		int iMax = tab.length - 1;

		System.out.println("affichage des elements du tableau pairs :");

		for (int i = 0; i <= iMax; i++) {
			if (tab[i] % 2 == 0) {
				System.out.println("index " + i + " : " + tab[i]);
			}
		}
		System.out.println();
	}

	public static void affichageElementsDuTableauIndexPairs(int[] tab) {
		int iMax = tab.length - 1;

		System.out.println("affichage des elements du tableau avec index pairs :");

		for (int i = 0; i <= iMax; i++) {
			if (i % 2 == 0) {
				System.out.println("index " + i + " : " + tab[i]);
			}
		}
		System.out.println();
	}

	public static void affichageElementsDuTableauImpairs(int[] tab) {
		int iMax = tab.length - 1;

		System.out.println("affichage des elements du tableau impairs :");

		for (int i = 0; i <= iMax; i++) {
			if (tab[i] % 2 == 1) {
				System.out.println("index " + i + " : " + tab[i]);
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		// int indexMax = array.length - 1;

		affichageElementsDuTableau(array);
		affichageElementsDuTableauOrdreInverse(array);
		affichageElementsDuTableauSuperieur3(array);
		affichageElementsDuTableauEntiersPairs(array);
		affichageElementsDuTableauIndexPairs(array);
		affichageElementsDuTableauImpairs(array);

	}

}
