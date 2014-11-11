import java.util.Scanner;


public class Ejercicio25 {

	/**
	 * N! = n*(n-1)
	 */
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		//ENTORNO
		/*
		 * n,f,i
		 */
		
		int n;
		int f;
		int i;
		
		//PROCESO
		/*
		 * i<--1
		 * f<--1
		 * visualizar "Introduce un número para ver su factorial:"
		 * leer n
		 * while (i<n)
		 * i<--i+1
		 * f<--f*i
		 * end while
		 * visualizar f
		 * 
		 * FIN
		 */
		i=1;
		f=1;
		System.out.println("Introduce un número para ver su factorial:"
);
		n=teclado.nextInt();
		while (i<n){
		
			i++;
			f=f*i;
		
		}System.out.println(f);
	
		}
	}
/*
 * ejemplo para orientarme
3! = 1*2*3 =6

i<n
i++
i=2
 f=f*i
 f=f*2
 f=2

i++
i=3
  f=f*i
  f=2*3
((( F=6))))   
*/

