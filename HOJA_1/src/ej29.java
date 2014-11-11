import java.util.Scanner;


public class ej29 {
	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
		
		//ENTORNO
		/*
		 * a,b enteros
		 * aux entero auxiliar
		 */
		int a,b,aux;
		
		//PROCESO
		/*
		 * leer a
		 * leer b
		 * visualizar a,b
		 * aux<--a
		 * a<--b
		 * b<--aux
		 * visualizar a,b
		 * 
		 * FIN
		 */
		
	System.out.println("Introduce primera variable:");
		a=teclado.nextInt();
	System.out.println("Introduce segunda variable:");
	b=teclado.nextInt();
	System.out.println("Valores iniciales: ");
	System.out.println("a= " + a + " b= " + b);
	
	aux=a;
	a=b;
	b=aux;
	
	System.out.println("Valores intercambiados: ");
	System.out.println("a= " + a + " b= " + b);
	
	}

}
