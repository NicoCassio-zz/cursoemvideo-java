package aula12;

import java.util.Scanner;

public class Programa01 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println("Cambalhota: " + i);
			i++;
		}while(i <= 4);
	}
}
