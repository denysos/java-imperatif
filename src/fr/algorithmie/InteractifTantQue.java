package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {

		// comment ça marche ???
		
		Scanner scanner = new Scanner(System.in);
		int nb = scanner.nextInt();

		while (nb >= 1 && nb <= 10) {
			nb = scanner.nextInt();
		}
		System.out.println("votre nombre est : " + nb);
	}

}
