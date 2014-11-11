import java.util.Scanner;


public class Ejercicio04 {
	public static void main(String[] args) {
		
Scanner teclado=new Scanner(System.in);
		
		//ENTORNO
		/*
		 * a,b,c  enteros
		 */
		int a,b,c;
		
		//PROCESO
		/*
		 * leer a
		 * leer b
		 * leer c
		 * if (a>b && a>c)
		visualizar "a es el número mayor"
		end if
		else if(b>a && b>c)
		visualizar "b es el número mayor"
		end if
		else if(c>a && c>b)
			visualizar "c es el número mayor"
			end if
		
			FIN
		 */
		
		System.out.println("Introduce el primer número:");
		a=teclado.nextInt();
		System.out.println("Introduce el segundo número:");
		b=teclado.nextInt();
		System.out.println("Introduce el tercer número:");
		c=teclado.nextInt();
		
		if (a>b && a>c){
			System.out.println(a + " es el número mayor");
		}else if(b>a && b>c){
			System.out.println(b + " es el número mayor");
		}else if(c>a && c>b){
			System.out.println(c + " es el número mayor");
		}

	}

}
