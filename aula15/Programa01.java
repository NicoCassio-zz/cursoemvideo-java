package aula15;

import java.util.Scanner;

public class Programa01 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int a, b;
		soma(3, 2);
	}
	static void soma(int a, int b) {
		int s = a + b;
		System.out.println("Soma: " + s);
	}
}
