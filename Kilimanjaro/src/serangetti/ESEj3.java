package serangetti;
import java.util.*;
public class ESEj3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double kmh, ms;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿A cuantos kilometros sobre hora va, señor/a?");
		kmh = sc.nextDouble();
		ms = kmh * 1000/3600;
		System.out.println(String.format("Osea que también va a %f metros sobre segundo.", ms));
		
		
		
		

	}

}
