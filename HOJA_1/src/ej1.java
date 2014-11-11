import java.util.Scanner;


public class ej1 {
	public static void main(String[] args) {
		
		//ENTORNO
		/* 
		 * n es un entero
		 * a es un real
		 * c es un caracter
		 */
	Scanner teclado = new Scanner (System.in);
int n;
float a;
char c;

       //PROCESO 
       /*
        * leer n
        * leer a
        * leer c
        * 
        * visualizar n
        * visualizar a
        * visualizar c
        * 
        * visualizar a+n
        * visualizar a-n
        * 
        * fin
        * 
        */
System.out.println("Introduce un entero");
n=teclado.nextInt();
System.out.println("Introduce un real");
a=teclado.nextFloat();
System.out.println("Introduce un caracter");
c=teclado.next().charAt(0);

System.out.println(a);
System.out.println(n);
System.out.println(c);
	
System.out.println("a+n --->" + a+n);
System.out.println(a-n + "<--- a-n");
	}

}