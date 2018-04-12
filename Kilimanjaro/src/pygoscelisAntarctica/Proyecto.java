/**
 * 
 */
package pygoscelisAntarctica;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * 
 *
 */
public class Proyecto {

	/**
	 * 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path file = Paths.get("C:\\argumentss", "kek.txt");
	ArrayList<String>lista = new ArrayList<String> ();
		try (BufferedReader reader = Files.newBufferedReader(file)) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] fields = line.split(", ");
				lista.add(fields[1]);
			}

		} catch (IOException x) {
			x.printStackTrace();

		}
		
		java.util.List<String> besttwo = lista.subList(0, 2);
		
		Iterator<String> iter = besttwo.iterator();
		while (iter.hasNext()) {
			String nombre =(String) iter.next();
			System.out.println(nombre);
		}
	}

}
