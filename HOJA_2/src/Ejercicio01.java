import java.util.Scanner;


public class Ejercicio01 {
	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
		
		//ENTORNO
		/*
		 * n entero
		 */
		int n;
		
		//PROCESO
		/*
		 * Leer n
		 * 
		 * if (n>0)
		 * visualizar "n es mayor que 0"
		 * end if
		 * else if (n<0)
		 * visualizar "n es menor que 0"
		 * else
		 * visualizar "n es igual que 0"
		 * end if
		 * 
		 * FIN
		 */
		
		n=teclado.nextInt();
		
		if (n>0){
			System.out.println("n es mayor que 0");
		}else if (n<0){
			System.out.println("n es menor que 0");
		}else{
			System.out.println("n es igual que 0");
		}

	}

}