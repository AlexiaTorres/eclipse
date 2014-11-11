import java.util.Scanner;


public class ej22 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		//ENTORNO
		/*
		 * c1, c2 caracteres
		 */
		char c1,c2;
		
		//PROCESO
		/*
		 * leer c1
		 * leer c2
		 * if c1==c2
		 *  visualizar "los caracteres son iguales"
		 *  else
		 *  visualizar "los caracteres son distintos"
		 * end if
		 * 
		 * FIN
		 * 
		 */
		
		System.out.println("Introduce el primer caracter:");
		c1=teclado.next().charAt(0);
		System.out.println("Introduce el segundo caracter:");
		c2=teclado.next().charAt(0);
		
		if (c1==c2){
			System.out.println("los caracteres son iguales");
		}else {
			System.out.println("los caracteres son distintos");
		}
	}

}
