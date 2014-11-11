import java.util.Scanner;


public class Ejercicio03 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		//ENTORNO
		/*
		 * a,b  enteros
		 */
		int a,b;
		
		//PROCESO
		/*
		 * Visualizar "introduce un numero"
		 * Leer a
		 * Visualizar "introduce otro"
		 * Leer b
		 * if (a>b)
		 * visualizar "a es mayor que b"
		 * end if
		 * else
		 *  if (a<b)
		 *   visualizar "a es menor que b"
		 *  end if
		 *   else
		 *   visualizar " a es igual que b"
		 *   end if
		 * end if  
		 * 
		 * FIN
		 */

		System.out.println("Introduce un numero (a)");
		a=teclado.nextInt();
		System.out.println("Introduce otro (b)");
		b=teclado.nextInt();
		
		if (a>b){
			System.out.println(a + " (a)es mayor que " +b + " (b)");
		}else{
			if (a<b){
				System.out.println(a + " (a) es menor que " +b +" (b)");
			}else {
				System.out.println(a + " (a)es igual que " +b + " (b)");
			}
		}
	}

}
