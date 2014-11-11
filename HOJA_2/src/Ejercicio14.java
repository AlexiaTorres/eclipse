import java.util.Scanner;


public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		// ENTORNO
		/*
		 * n  entero entre 0 y 10
		 */
		int n;
		
		//PROCESO
		/*
		 * visualizar "Introduce un número entero"
		 * leer n
		 * if(n>=0 && n<=10)
		 * visualizar n
		 * end if
		 * 
		 * FIN
		 */

		System.out.println("Introduce un número entero");
		n=teclado.nextInt();
		if(n>=0 && n<=10){
			System.out.println(n);
		}
	}

}
