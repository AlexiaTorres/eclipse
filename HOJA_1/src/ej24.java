import java.util.Scanner;


public class ej24 {
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
		 * if (c>='0' && c<='9')
			Visualizar "el caracter es un número"
		   end if
		    else if (c>='a' && c<='z')
			 visualizar "es una letra"
			end if
			
			FIN
		 */
		System.out.println("Introduce un caracter");
		c=teclado.next().charAt(0);
		
		if (c>='0' && c<='9'){
			System.out.println("el caracter es un número");
		}else if (c>='a' && c<='z'){
			System.out.println("es una letra");
		}
	}

}
