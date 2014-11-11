import java.util.Scanner;


public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);	
		//ENTORNO
        /*
         * n  entero
         * neg  contador de enteros negativos
         * pos contador de enteros positivos
         */
		int n;
		int neg;
		int pos;
		
		//PROCESO
		/*
		 * neg <--0
		 * pos <--0
		 * n <--1
		 * 
		 * while(n!=0)
		 * visualizar "introduce un número"
		 * leer n
		 *  if(n<0)
		 *   neg<--neg+1
		 *  end if
		 *  if(n>0)
		 *   pos<--pos+1
		 *  end if
		 * end while
		 * Visualizar neg,pos
		 * 
		 * FIN
		 */
	neg=0;
	pos=0;
	n=1;
	
	while(n!=0){
		System.out.println("Introduce un numero negativo o positivo");
		n=teclado.nextInt();
		
		if(n<0){
			neg++;
		}
		if(n>0){
			pos++;
		}
		
	}
	System.out.printf("Números positivos: %d  Números negativos: %d",pos,neg);

	}

}
