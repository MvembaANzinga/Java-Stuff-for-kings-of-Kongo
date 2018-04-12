/**
 * 
 */
package serangetti;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * @author Java
 *
 */
public class Extra1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Path file = Paths.get("C:\\argumentss", "neet.txt");
		ArrayList<String>lista = new ArrayList<String> ();
			try (BufferedReader reader = Files.newBufferedReader(file)) {
				String line = null;
				while ((line = reader.readLine()) != null) {
					String[] fields = line.split(", ");
					
					lista.add(fields[1]); 
				}
				
			}
				 catch (IOException x) {
						x.printStackTrace();
				 }
		
		for (int j = 0; j < 8; j++) {
			System.out.println(lista);
			
		}
		
		
		
		
	}

}

