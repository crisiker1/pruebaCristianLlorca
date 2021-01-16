package pruebaCristianLlorca.anagrama;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class Anagrama {

	public ArrayList<String> ProcesarAnagrama(ArrayList<String> fichero) throws FileNotFoundException, IOException {

		ArrayList<String> anagramaFinal_palabras = new ArrayList<String>();

		try {
			for (int i = 0; i < fichero.size(); i++) {
				// Se comprueba la palabra con la siguiente, quitando los caracteres especiales.
				for (int y = i + 1; y < fichero.size(); y++) {
					String palabra1 = fichero.get(i).toLowerCase().replaceAll("[()-+.\\\\^/{}:,?¿]", "");
					String palabra1_aux = fichero.get(i);
					String palabra2 = fichero.get(y).toLowerCase().replaceAll("[()-+.\\\\^/{}:,?¿]", "");
					String palabra2_aux = fichero.get(y);

					// Se van reemplazando las letras que coinciden por ""
					if (palabra1.length() == palabra2.length()) {
						for (int j = 0; j < palabra2.length(); j++) {
							if (palabra1.contains("" + palabra2.charAt(j))) {
								palabra1 = palabra1.replaceFirst("" + palabra2.charAt(j), "");
								palabra2 = palabra2.replaceFirst("" + palabra2.charAt(j), "");
								j = 0;
							}
						}

					}
					// Se comprueba que las dos palabras son un anagrama y se añaden a la Lista, indicando la palabra y su correspondiente anagrama
					if (palabra1.equalsIgnoreCase(palabra2) && palabra1.length() > 0) {

						if (!anagramaFinal_palabras.contains(palabra2_aux)) {
							anagramaFinal_palabras.add("Palabra " + palabra1_aux + " es anagrama de: " + palabra2_aux);
						}

					}

				}
			}

		} catch (Exception e) {
			System.out.println("Excepcion del Anagrama: " + e);
		}
		return anagramaFinal_palabras;

	}

}
