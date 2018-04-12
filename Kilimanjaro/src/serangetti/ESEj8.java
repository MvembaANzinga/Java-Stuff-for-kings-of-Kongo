/**
 * 
 */
package serangetti;

import java.util.*;

/**
 * @author Java
 *
 */
public class ESEj8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// arrays ej 1
		int n=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número please.");
		n = sc.nextInt();
		int[] kek = new int[n];
				for ( int i = 0; i< n; i++) {
					System.out.println("Ingrese el valor número " + (i+1));
					kek[i] = sc.nextInt();
					

		}
   for (int j = n-1; j >= 0; j--) {
	   System.out.println("El valor número " + (j+1) + ":");
	   System.out.println(kek[j]);
	   
	   
   }
	}

}