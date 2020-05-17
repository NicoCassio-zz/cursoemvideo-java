package aula09;

import java.util.Scanner;

public class Programa01 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		float n1, n2, m;
		System.out.print("Nota 1: ");
		n1 = input.nextFloat();
		System.out.print("Nota 2: ");
		n2 = input.nextFloat();
		m = (n1 + n2) / 2;
		System.out.printf("Sua média foi %.2f\n", m);
		if(m >= 9) {
			System.out.println("PARABÉNS");
		}
	}
}
