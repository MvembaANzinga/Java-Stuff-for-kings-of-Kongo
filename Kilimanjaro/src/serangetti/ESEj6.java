/**
 * 
 */
package serangetti;

import java.util.*;

/**
 * @author Java
 *
 */
public class ESEj6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N;
		System.out.println("Introduzca un número natural de 3 cifras:");
		N = sc.nextInt();
		System.out.println("Primera cifra: " + N / 100);
		System.out.println("Segunda cifra: " + (N / 10) % 10);
		System.out.println("Tercera Cifra: " + N % 10);

	}

}
