package aula14;

import java.util.Scanner;
import java.util.Arrays;

public class Programa04 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int n[] = {3, 7, 6, 1, 9, 4, 2};
		for(int i: n) {
			System.out.print(i + " ");
		}
		System.out.println("Valor 1 na posição: " + Arrays.binarySearch(n, 1));
	}
}
