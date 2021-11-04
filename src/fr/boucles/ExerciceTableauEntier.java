package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		int[] tableauEntiers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.print("premier element du tableau : ");
		System.out.println(tableauEntiers[0]);

		System.out.print("longueur du tableau : ");
		System.out.println(tableauEntiers.length);

		System.out.print("dernier element du tableau : ");
		System.out.println(tableauEntiers[tableauEntiers.length - 1]);

		System.out.println("element d'index 4 : " + tableauEntiers[4]);
		tableauEntiers[4] = 8;
		System.out.println("element d'index 4 modifié : " + tableauEntiers[4]);

	}

}
