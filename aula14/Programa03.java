package aula14;

import java.util.Scanner;
import java.util.Arrays;

public class Programa03 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int n[] = {3, 1, 7, 5};
		Arrays.sort(n);
		for(int i: n) {
			System.out.println(i);
		}
	}
}
