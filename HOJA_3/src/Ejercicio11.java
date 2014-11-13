import java.util.Scanner;


public class Ejercicio11 {
	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);
//ENTORNO
/*
 * 		
 */

		int aux,suma,n,i,j,d;
		i=1;
		suma=0;
		System.out.println("Introduce un número: ");
		n=teclado.nextInt();
		while(i<n){
			d=0;
			aux=0;
			j=1;
			i++;
			while (j<=i){
				aux=j;
			j++;
			if ( i%j==0) {
				d++;
			}
            if (d==2)  {
            	break;
            	}
		}
            if (aux==i)  {
            	suma=suma+i;
            }

		}
		System.out.println (suma);
		
	}}