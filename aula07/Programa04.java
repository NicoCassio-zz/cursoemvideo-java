package aula07;

import java.util.Scanner;

public class Programa04 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Digite um número: ");
		int n = input.nextInt();
		float r = (float) Math.sqrt(n);
		System.out.println("Raiz de " + n + ": " + r);
	}
}
