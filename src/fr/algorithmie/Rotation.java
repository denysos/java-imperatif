package fr.algorithmie;

import java.util.Arrays;

public class Rotation {
	int[] tableau;

//	public Rotation(int[] tableau) {
//		super();
//		this.tableau = tableau;
//	}

	public String ditCoucou() {
		return "coucou";
	}

	public int[] rotation(int[] tableauATraiter) {
		int longueurTableau = tableauATraiter.length;

		if (longueurTableau == 0) {
			return tableauATraiter;
		}

		int dernierElement = tableauATraiter[longueurTableau - 1];
		int[] tableauFinal = new int[longueurTableau];
		// Arrays.copyOfRange(tableauATraiter, -1, longueurTableau);

		tableauFinal[0] = dernierElement;
		for (int i = 0; i < longueurTableau - 1; i++) {
			tableauFinal[i + 1] = tableauATraiter[i];
		}
		return tableauFinal;
		// return tableauATraiter;
	}
}
