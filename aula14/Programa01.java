package aula14;

import java.util.Scanner;

public class Programa01 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int n[] = {1, 3, 5, 7};
		for(int i = 0; i < n.length; i++) {
			System.out.println("N[" + i + "]: " + n[i]);
		}
	}
}
