import java.util.Scanner;


public class ej21 {
	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
		//ENTORNO
		/*
		 * c caracter
		 */
		char c;
		
		//PROCESO
		/*
		 * leer c
		 * if (c>='A' && c<='Z')
		 * visualizar "la letra es mayúscula"
		 * else
		 * visualizar "la letra es minuscula"
		 * 
		 * FIN
		 */
		System.out.println("Introduce un caracter:");
		c=teclado.next().charAt(0);
		if (c>='A' && c<='Z'){
			System.out.println("mayúscula");
		}else{
			System.out.println("minúscula");
		}

		
	}

}
