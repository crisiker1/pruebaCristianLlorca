package pruebaCristianLlorca.fichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Fichero {

	
	//Se lee el fichero, y devuelve cada linea en una posición de la Lista
	public ArrayList<String> LeerFichero(String fichero) throws FileNotFoundException, IOException {
		ArrayList<String> miFichero = new ArrayList<String>();
		try {
			FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);

			String linea;
			while ((linea = br.readLine()) != null) {
				miFichero.add(linea);
			}
			fr.close();

		}catch (Exception e) {
			System.out.println("Excepcion del fichero " + fichero + ": " + e);
		}
		return miFichero;

	}
	
}
