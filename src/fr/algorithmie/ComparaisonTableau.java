package fr.algorithmie;

import java.util.Arrays;

public class ComparaisonTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4 };
		int longeurArray1 = array1.length;
		int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };
		int longeurArray2 = array2.length;
		int indexArray1 = 0;
		int indexArray2 = 0;
		int compteurElementsEgaux = 0;

		Arrays.sort(array1);
		Arrays.sort(array2);

		while (indexArray1 < longeurArray1 - 1 || indexArray2 < longeurArray2 - 1) {
			if (array1[indexArray1] < array2[indexArray2]) {
				indexArray1++;
			} else if (array1[indexArray1] > array2[indexArray2]) {
				indexArray2++;
			} else if (array1[indexArray1] == array2[indexArray2]) {
				compteurElementsEgaux++;
				indexArray1++;
				indexArray2++;

			}

		}

		System.out.println("nombre d'elements egaux : " + compteurElementsEgaux);
	}
}
