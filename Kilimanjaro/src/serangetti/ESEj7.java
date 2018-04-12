/**
 * 
 */
package serangetti;

import java.util.*;

/**
 * @author Java
 *
 */
public class ESEj7 {
	int n;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "";
		System.out.println("Ingrese un caracter entre 0 y 9:");
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		String mensaje = "";
		mensaje += validateInput(input);
		mensaje += validateInputLength(input);
		if (mensaje.length() == 0) {
			mensaje = "Todo perfecto!";
		}
		System.out.println(mensaje);
	}

	public static String validateInput(String input) {
		try {
			Integer integer = new Integer(input);
			if (integer >= 0 && integer < 10) {
				return "";

			} else {
				return "No es un número entre 0 y 9. \n";
			}
		}

		catch (NumberFormatException e) {
			e.printStackTrace();
			return "Esto no es un número, ¿Que onda? \n";
		}
	}

	private static String validateInputLength(String input) {
		if (input.length() != 1) {
			return "Input inválido, por favor solo colocar un número. \n";
		} else {
			return "";
		}
	}

}
