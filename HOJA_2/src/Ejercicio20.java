	import java.util.Scanner;
	
public class Ejercicio20 {
		public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
			// ENTORNO
			/*
			 * n  entero
			 * p  entero cntador de pares
			 * i  entero cntador de impares
			 */
			int n;
			int p;
			int i;
			
			//PROCESO
			/*
			 * n<--0
			 * p<--0
			 * i<--0
			 * while(n>=0)
			 * visualizar "Introduce un número entero"
			 * leer n
			 *  if(n%2==0 && n>0)
			 *   p<--p+1
			 *  end if
			 *  if(n%2!=0 && n>0)
			 *   i<--i+1
			 *  end if
			 * end while
			 * visualizar p
			 * visualizar i
			 */
			
			n=0;
			p=0;
			i=0;
			while (n>=0){
				System.out.println("Introduce un número entero");
				n=teclado.nextInt();
				if(n%2==0 && n>0){
					p++;
				}
				if(n%2!=0 && n>0){
					i++;
				}
			}
			System.out.println("Cantidad de números pares introducidos:" +p);
			System.out.println("Cantidad de números impares introducidos:" +i);
		}

	}
