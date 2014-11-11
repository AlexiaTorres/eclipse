import java.util.Scanner;


public class ej15 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		//ENTORNO
		/*
		 * n entero
		 */
		int n=sc.nextInt();
	
		//PROCESO
		/*
		 * leer n
		 * visualizar n/100
		 * visualizar(n/10%)10
		 * visualizar n%10
		 */
		System.out.println(n);
		System.out.println(n/100);
		System.out.println((n/10)%10);
		System.out.println(n%10);
	}

}
