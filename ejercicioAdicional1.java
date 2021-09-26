package ejercicios;

import java.util.Scanner;

public class ejercicioAdicional1 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		notaMediaFinal();								// llamada a metodo principal
	}
	
	public static void notaMediaFinal() {
		float nota = 0, input = 0;
		System.out.println("Introduce el nombre de le alumne: ");
		String nombre = sc.next();
		
		for(int i = 0; i < 3; i++) {							// pedimos las notas usando un bucle
			System.out.println("Introduce la " + (i+1) + ". nota [0-10]: ");	//para no repetir codigo
			input = sc.nextFloat();
			nota = nota + ((input > 10) ? 10 : input);
		}
		notaOut((nota/3), nombre, actitud());						// calculamos la media en llamada
	}											//a funcion de salida
	
	public static String actitud() {
		System.out.println("Introduce la actitud de le alumne: ");
		String actitud = sc.next();
		actitud = actitud.toUpperCase();						// convierte a mayusculas
		String result;									// de esta forma solo tenemos que
												//considerar 4 casos
		switch((char) actitud.getBytes()[0]) {						// coge solo el primer caracter
			case 'A':								// el casteo a char es redundante
				result = "Actitud muy buena";
				break;
			case 'B':
				result = "Buena actitud";
				break;
			case 'C':
				result = "La actitud es normal";
				break;
			case 'D':
				result = "Actitud negativa, contacte con tutoría";
				break;
			default:
				result = "La actitud no ha sido tenida en cuenta";
				break;
		}
		return result;									// devolvemos string con la actitud
	}

	public static void notaOut(float nota, String nombre, String actStr) {			// elige la nota y la printea
		String notaEscrita;								// junto con el resto de info
		if (nota < 5) {
			notaEscrita = "insuficiente";
		} else {
			if (nota > 6) {
				notaEscrita = "notable";
			} else if (nota > 7) {
				notaEscrita = "bien";
			} else if (nota > 9) {
				notaEscrita = "sobresaliente";
			} else {
				notaEscrita = "suficiente";
			}
		}
		System.out.println(nombre + " ha sacado un " + 					// resultado final
				nota + " (" + notaEscrita + "). " + actStr);
	}

}
