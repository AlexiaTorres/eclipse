import java.util.Scanner;


public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
	//ENTORNO
	/*
	 * c  contador, real
	 * n  entero
	 * s  suma, real	
	 */
		
		int n;
		double c;
		double s;
		
		
	//PROCESO
	/*
	 * Leer n
	 * c<--2
	 * s<--0
	 * 
	 * while(c<=n)
	 *  s<--<+(1/c)
	 *  c<--c+1
	 *  visualizar s
	 * end while 
	 *  	
	 */
		
	System.out.println("Introduce número límite de la serie");
	n=teclado.nextInt();
	c=2;
	s=0;
	
	
	while(c<=n){
		s=s+(1/c);
		c++;
		System.out.println(s);

	}

	}

}
