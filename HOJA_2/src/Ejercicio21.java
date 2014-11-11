	import java.util.Scanner;
	
public class Ejercicio21 {
		public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
			// ENTORNO
			/*
			 * n  entero
			 * p  entero cntador de pares
			 * i  entero cntador de impares
			 * pc entero porcentaje
			 */
			int n;
			int p;
			int i;
			int pc;

			//PROCESO
			/*
			 * n<--0
			 * p<--0
			 * i<--0
			 * pc<--0
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
			 * pc=p*100/(i+p);
			 * visualizar pc %
			 * visualizar i
			 * pc=i*100/(i+p);
			 * visualizar pc %
			 * 
			 * FIN
			 */
			
			n=0;
			p=0;
			i=0;
			pc=0;
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
			pc=p*100/(i+p);
			System.out.println(pc + "%");
			System.out.println("Cantidad de números impares introducidos:" +i);
			pc=i*100/(i+p);
			System.out.println(pc + "%");
		}

	}
