import java.util.Scanner;


public class Ejercicio23 {
	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);

		// ENTORNOS
		/*
public class Ejercicio22 {
	public static void main(String[] args) {
		//ENTORNO
		/*
		 * n  entero del 0 al 9
		 * m  entero
		 */
		int n;
		int m;
		
		//PROCESO
		/*
		 * n<--0
		 * visualizar "introduce el número que quieras multiple"
		 * leer m
		 * visualizar n*m
		 * while (n>=0 && n<9)
		 *  n<--n+1
		 *  visualizar n*m
		 * end while
		 * 
		 * FIN
		 */
		
		n=0;
		System.out.println("Introduce el número que quieras multiplicar:");
		m=teclado.nextInt();
		System.out.println(m + "x" +n + "= " + n*m);

		while (n>=0 && n<9){
			n++;
			System.out.println(m + "x" +n + "= " + n*m);
		}

	}

	}

