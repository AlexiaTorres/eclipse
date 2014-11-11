import java.util.Scanner;


public class Ejercicio10 {
	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);	
		//ENTORNO
		/*
		 * n  entero
		 * f  entero
		 */
		int f;
		int n;
		
		//PROCESO
		/*
		 * Visualizar "Introduce un número para saber su factorial"
		 * Leer n
		 * f<--1
		 * while(n!=0)
		 *  f<--f*n
		 *  n<--n-1
		 * end while
		 * visualizar f
		 * 
		 * FIN
		 */
				/*
				 * ejemplo para aclararme
				 * 4!=1*2*3*4
				 * n=4
				 * f=f*n
				 * f=1*4
				 *   f=4
				 * n--
				 * n=3
				 * f=4*3
				 *   f=12
				 * n--
				 * n=2
				 * f=12*2
				 *   f=24
				 * n--
				 * n=1
				 * f=24*1
				 *   f=24    
				 */
		
		
		
		System.out.println("Introduce un número para saber su factorial");
		n=teclado.nextInt();
		f=1;
		while (n!=0){
			f=f*n;
			n--;
		}
	System.out.printf("El factorial es %d",f);
	}

}
