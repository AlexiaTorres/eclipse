import java.util.Scanner;


public class ej23 {
	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
		//ENTORNO
		/*
		 * c1,c2 caracteres
		 */
		char c1,c2;
		
		//PROCESO
		/*
		 * leer c1
		 * leer c2
		 * if (c1>='a' && c1<='z' && c2>='a' && c2<='z')
			visualizar "ambas son minusculas"
		   end if
		   else if (c1>='a' && c1<='z' && c2>='A' && c2<='Z')
			visualizar "solo la primnera es minuscula"
		   end if
		   else if (c1>='A' && c1<='Z' && c2>='a' && c2<='z')
			visualizar "solo la segunda es minuscula"
		   end if
		   else if (c1>='A' && c1<='Z' && c2>='A' && c2<='Z')
		   end if 
		 * FIN
		 */
		System.out.println("Introduce el primer caracter:");
		c1=teclado.next().charAt(0);
		System.out.println("Introduce el segundo caracter:");
		c2=teclado.next().charAt(0);
		
		if (c1>='a' && c1<='z' && c2>='a' && c2<='z'){
			System.out.println("ambas son minusculas");
		}else if (c1>='a' && c1<='z' && c2>='A' && c2<='Z') {
			System.out.println("solo la primnera es minuscula");
		}else if (c1>='A' && c1<='Z' && c2>='a' && c2<='z') {
			System.out.println("solo la segunda es minuscula");
		}else if (c1>='A' && c1<='Z' && c2>='A' && c2<='Z') {
			System.out.println("ninguna es minuscula");
		}
	}}