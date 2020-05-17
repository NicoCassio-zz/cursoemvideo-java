package aula15;

import java.util.Scanner;

public class Programa02 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Soma: " + soma(3, 2));
	}
	static int soma(int a, int b) {
		return a + b;
	}
}
