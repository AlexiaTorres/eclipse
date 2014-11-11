import java.util.Scanner;


public class Ejercicio11 {
	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);	
		//ENTORNO
        /*
         * n  entero
         * neg  contador de enteros negativos
         */
		int n;
		int neg;
		
		//PROCESO
		/*
		 * neg <--0
		 * n <--1
		 * 
		 * while(n!=0)
		 * visualizar "introduce un número"
		 * leer n
		 *  if(n<0)
		 *   neg<--neg+1
		 *  end if
		 * end while
		 * Visualizar neg
		 * 
		 * FIN
		 */
		
		
	neg=0;
	n=1;
	
	while(n!=0){
		System.out.println("Introduce un numero");
		n=teclado.nextInt();
		
		if(n<0){
			neg++;
		}
	}
	System.out.printf("Números negativos: %d",neg);

	}

}
