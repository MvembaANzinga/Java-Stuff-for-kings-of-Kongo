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
	        System.out.print("Introduzca valor de N: ");
	        N = sc.nextInt(); //supondremos que el n�mero introducido tiene 3 cifras
	        System.out.println("Primera cifra de " + N + " -> " + (N/100)); 
	        System.out.println("Cifra central de " + N + " -> " + (N/10)%10);
	        System.out.println("�ltima cifra  de " + N + " -> " + (N%10));
	         
	    }   
	 
		
		
		
		
		
		
		
		
		
	

}
