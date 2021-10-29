package metodosEstaticos;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int inputInt(int min, int max) {
		int resultado; boolean bien = false;
		do {
			resultado = sc.nextInt();
			if(resultado >= min &&
					resultado <= max) bien = true;
			else System.out.println("Introduce un numero "
					+ "que cumpla las condiciones");
		} while(!bien);
		return resultado;
	}

	public static int inputInt() {
		return sc.nextInt();
	}
	
	public static String inputString() {
		String resultado = "";
		boolean bien = false;
		do {
			resultado = sc.next();
			if(resultado != "") bien = true;
		} while(!bien);
		return resultado;
	}

	public void <T> printArray(T[] a) {	
		System.out.println("Los valores introducidos son:");
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void ejercicioA() {
		int[] numeros 	= new int[10];
		int[] numeros2	= new int[10];
		String nombre 	= inputString();
		for(int i : numeros) {
			System.out.println("Introduce un numero entre 10 y 500");
			numeros[i] = inputInt(50,500);
			numeros2[i] = numeros[i]*2;
		}
	}

}
