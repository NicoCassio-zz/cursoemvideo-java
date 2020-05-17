package aula10;

import java.util.Scanner;

public class Programa02 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int pernas;
		String tipo;
		System.out.print("Pernas: ");
		pernas = input.nextInt();
		switch(pernas) {
			case 1:
				tipo = "saci";
				break;
			case 2:
				tipo = "bípede";
				break;
			case 4:
				tipo = "quadrúpede";
				break;
			case 6:
			case 8:
				tipo = "aranha";
				break;
			default:
				tipo = "ET";
		}
		System.out.println("Tipo: " + tipo);
	}
}
