import java.util.Scanner;


public class Ejercicio19 {
	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);
		// ENTORNO
		/*
		 * n  entero
		 * c  entero cntador de pares
		 */
		int n;
		int c;
		
		//PROCESO
		/*
		 * n<--0
		 * c<--0
		 * 
		 * while(n>=0)
		 * visualizar "Introduce un número entero"
		 * leer n
		 *  if(n%2==0 && n>0)
		 *   c<--c+1
		 *  end if
		 * end while
		 * visualizar c
		 */
		
		n=0;
		c=0;
		while (n>=0){
			System.out.println("Introduce un número entero");
			n=teclado.nextInt();
			if(n%2==0 && n>0){
				c++;
			}
		}
		System.out.println("Cantidad de números pares introducidos:" +c);

	}

}
