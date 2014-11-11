import java.util.Scanner;


public class Ejercicio18 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		//ENTORNO
		/*
		 * n  entero
		 * c  contador entero
		 */
		int n;
		int c;
		//PROCESO
		/*
		 * n<--1
		 * c<--0
		 * while (n!=0)
		 * visualizar "introduce un número entero"
		 * leer n
		 * c<--c+1
		 * end while
		 * visualizar c
		 * 
		 *  FIN
		 */
		n=1; 
		c=0;
		while (n!=0){
			System.out.println("Introduce un número entero");
			n=teclado.nextInt();
			if (n!=0){
			c++;
		    }
		}
		System.out.println("Números introducidos: " + c);

	}

}
