/**
 * 
 */
package serangetti;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.IOException;
/**
 * @author Java
 *
 */
public class extraextra1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int morekek[8];
		Path file = Paths.get("C:\\argumentss", "neet.txt");
		ArrayList<String>lista = new ArrayList<String> ();
			try (BufferedReader reader = Files.newBufferedReader(file)) {
				String line = null;
				while ((line = reader.readLine()) != null) {
					String[] fields = line.split(", ");
			
					lista.add(fields[1]); 
	
	
	
	
	
	
	
	
	
	
	
	}

}
}
}