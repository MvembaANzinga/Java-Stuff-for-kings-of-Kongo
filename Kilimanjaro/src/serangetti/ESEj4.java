/**
 * 
 */
package serangetti;

import java.util.*;
import java.lang.*;

/**
 * @author Java
 *
 */
public class ESEj4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double c1, c2, hip;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el valor del primer cateto:");
		c1 = sc.nextDouble();
		System.out.println("Ingrese el valor del segundo cateto:");
		c2 = sc.nextDouble();
		hip = c2 * c2 + c1 * c1;
		hip = Math.sqrt(hip);
		System.out.println(String.format("La hipotenusa es %f .", hip));

	}

}
