package aula07;

import java.util.Scanner;

public class Programa06 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double aleatorio = Math.random();
		int n = (int) (5 + aleatorio * (10 - 5));
		System.out.println("Número aleatório: " + aleatorio);
		System.out.println("Número aleatório entre 10 e 5: " + n);
	}
}
