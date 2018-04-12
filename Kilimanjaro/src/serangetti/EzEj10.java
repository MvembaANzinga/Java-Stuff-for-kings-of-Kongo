/**
 * 
 */
package serangetti;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * @author Java
 *
 */
public class EzEj10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try ( PrintWriter exit = new PrintWriter("C:/argumentss/neet2.txt")) {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int kappa = 0;
		int numbe = 0;
		do {
			System.out.println("Introduzca la cantidad de números:");
			kappa = sc.nextInt();
		} while (kappa < 1);
		for (int i=0; i < kappa; i++) {
			numbe = rnd.nextInt(1000);
			exit.println(numbe);
			
		}

	} catch (FileNotFoundException e) {
        System.out.println(e.getMessage()); }
	}
	
}