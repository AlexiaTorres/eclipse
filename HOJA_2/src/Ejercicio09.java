import java.util.Scanner;


public class Ejercicio09 {
	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	
		//ENTORNO
		/*
		 * n  entero
		 */
		int n;
		
		//PROCESO
		/*
		 * visualizar "introduce un numero:"
		 * Leer n
		 * 
		 * while (n!=0)
		 *  visualizar "introduce un n�mero:"
		 *  leer n
		 * end while
		 * 
		 * FIN
		 */
		System.out.println("Introduce un n�mero:");

		n=teclado.nextInt();
		while (n!=0){
			System.out.println("Introduce un n�mero:");
			n=teclado.nextInt();
		}
		

	}

}
