package aula11;

import java.util.Scanner;

public class Programa02 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int i = 1, n;
		System.out.print("Número: ");
		n = input.nextInt();
		while(i <= n) {
			System.out.print(i + ".. ");
			i++;
		}
		System.out.println();
	}
}
