/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "PROYECTO_LOGICA.java."

import java.io.*;
import java.math.*;

public class proyecto_logica {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double ii;
		String lvalor1;
		double resultado;
		double resultadou;
		String tutorial;
		int valor1;
		int valor2;
		tutorial = "Leer introduccion.avi";
		System.out.println(tutorial);
		lvalor1 = "Resuelve la siguiente operaci�n:";
		System.out.println(lvalor1);
		for (ii=1;ii<=10;ii++) {
			valor1 = (int) Math.floor(Math.random()*50);
			valor2 = (int) Math.floor(Math.random()*10);
			do {
				System.out.println(valor1+"*"+valor2);
				resultado = valor1*valor2;
				resultadou = Double.parseDouble(bufEntrada.readLine());
				if (resultado==resultadou) {
					System.out.println("Muy bien");
				} else {
					System.out.println("Intentalo de nuevo");
				}
			} while (resultado!=resultadou);
		}
	}


}

