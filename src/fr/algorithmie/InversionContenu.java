package fr.algorithmie;

public class InversionContenu {

	/**
	 * 
	 * inversion du contenu d'un tableau
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		System.out.println("inversion d'un tableau :");

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int longueurTableau = array.length - 1;
		int[] arrayCopy = new int[longueurTableau];

		for (int i = 0; i < longueurTableau; i++) {
			arrayCopy[i] = array[longueurTableau - 1 - i];

		}

		for (int i = 0; i < longueurTableau; i++) {
			System.out.println("tableau initial : " + array[i] + " tableau copié   : " + arrayCopy[i]);
		}
	}

}
