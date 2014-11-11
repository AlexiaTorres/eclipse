import java.util.Scanner;


public class Ejercicio26 {
	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);
//ENTORNO
/*
 * a,b,c  enteros por teclado
 */
		int a,b,c,aux;
//PROCESO
/*
 * leer a
 * leer b
 * leer c
 * 
 * while(a>b && a>c && b<a && b>c && c<a && c<b)
 * aux<--a
 * a<--b
 * b<--c
 * c<--aux
 * end while
 * 
 * visualizar a,b,c
 * FIN
 * 
 */
	System.out.println("Introduce tres números: ");
	a=teclado.nextInt();
	b=teclado.nextInt();	
	c=teclado.nextInt();
	
	while(a>b || a>c || b<a || b>c || c<a || c<b){
		aux=a;
		a=b;
		b=c;
		c=aux;
	}System.out.printf("%d,%d,%d",a,b,c);
	
	}

}
