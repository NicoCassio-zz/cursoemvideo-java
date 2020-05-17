package aula14;

import java.util.Scanner;
import java.util.Arrays;

public class Programa05 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int n[] = new int[5];
		Arrays.fill(n, 8);
		for(int i: n) {
			System.out.print(i + " ");
		}
	}
}
