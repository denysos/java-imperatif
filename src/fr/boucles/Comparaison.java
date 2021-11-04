package fr.boucles;

public class Comparaison {

	public static void affichagesChiffresDe1a10() {
		System.out.println("affichage de tous les chiffres de 1 à 10 :");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println();
	}

	public static void afficher20FoisDenisMourier() {
		System.out.println("afficher 20 fois 'Denis Mourier' :");
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + " " + "DenisMourier");
		}

		System.out.println();

	}

	public static void afficherElementsPairsDe2a100() {
		System.out.println("les nombres pairs de 2 à 100");
		for (int i = 2; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");

			}

		}
		System.out.println();
		System.out.println();
	}

	public static void afficherElementsImpairDe1a99() {
		System.out.println("les nombres impairs de 1 à 99");
		for (int i = 1; i <= 99; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
	
			}

		}
		System.out.println();
		System.out.println();

	}

	public static void main(String[] args) {

		affichagesChiffresDe1a10();
		afficher20FoisDenisMourier();
		afficherElementsPairsDe2a100();
		afficherElementsImpairDe1a99();
	}

}
