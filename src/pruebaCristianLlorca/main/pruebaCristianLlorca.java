package pruebaCristianLlorca.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


import pruebaCristianLlorca.anagrama.Anagrama;
import pruebaCristianLlorca.fichero.Fichero;

public class pruebaCristianLlorca {

	
	private static Fichero f;
	private static Anagrama a;
	
	
	//Pruebas realizadas en el Main
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String fichero = "C:\\Users\\Cris\\Documents\\wordlist.txt";
		//String fichero = "/pruebaCristianLlorca/wordlist.txt";
		ArrayList<String> miFichero = new ArrayList<String>();
		ArrayList<String> anagramaFinal = new ArrayList<String>();
		
		f = new Fichero();
		a = new Anagrama();
		miFichero = f.LeerFichero(fichero);
		anagramaFinal = a.ProcesarAnagrama(miFichero);
		
		
		
		for(int i =0; i<anagramaFinal.size();i++) {
			System.out.println(anagramaFinal.get(i));
		}
		
		
		
		

	}

}
