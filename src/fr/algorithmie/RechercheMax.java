package fr.algorithmie;

/**
 * 
 * @author denis recherche de la valeur maximale d'un tableau
 */
public class RechercheMax {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int valeurMax = array[0];
		int indexMax = array.length - 1;
		for (int i = 0; i <= indexMax; i++) {
			if (array[i] >= valeurMax) {
				valeurMax = array[i];
			}
		}
		System.out.println("valeur maximale du tableau : " + valeurMax);

	}

}
