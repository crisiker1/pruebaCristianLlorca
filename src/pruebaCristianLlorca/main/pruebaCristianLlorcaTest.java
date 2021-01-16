package pruebaCristianLlorca.main;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import pruebaCristianLlorca.anagrama.Anagrama;
import pruebaCristianLlorca.fichero.Fichero;

class pruebaCristianLlorcaTest {

	private static Fichero f;
	private static Anagrama a;
	
	@BeforeEach
	void init(TestInfo testInfo) throws Exception {
		System.out.println("Iniciando: " + testInfo.getDisplayName());
	}


	

	@Test
	void test() throws FileNotFoundException, IOException{
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
	
	@AfterEach
	void tearDown(TestInfo testInfo) throws Exception {
		System.out.println("Finalizando: " + testInfo.getDisplayName());
	}

}
