import java.util.Scanner;


public class ej9 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		//ENTORNO
		/*
		 ** c entero
		 * f real
		 */
		
		int c = teclado.nextInt();
		
		//PROCESO
		/*
		 * leer c
		 * f <-- 32+9*c/5
		 * visualizar "c grados centigrados = f grados farenheit"
		 */
		
		double f=32+9*c/5;
		
		System.out.println(c + " grados centigrados = " + f + " grados fahrenheit");
		
		
		
		
	}

}
