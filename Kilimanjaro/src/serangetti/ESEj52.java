/**
 * 
 */
package serangetti;

import java.util.Scanner;

/**
 * @author Java
 *
 */
public class ESEj52 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double vol, rad;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el radio de la esfera.");
		rad = sc.nextDouble();
		vol = solveVolume(rad);
		System.out.println(String.format("El volumen es de %f", vol));

	}

	private static double solveVolume(double rad) {
		double volume = (4 * Math.PI * Math.pow(rad, 3)) / 3;
		return volume;

	}
}