import java.util.Scanner;


public class Ejercicio06 {
	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);

//ENTORNO
/*
 * x,y  enteros introducidos por teclado
 * i  contador
 * p  potencia
 */
int x,y;
int i;
int p;

//PROCESO
/*
 * leer x
 * leer y
 * i<--1
 * p<--x
 * 
 * repeat
 * p=p*x
 * i<--i+1
 * until (i=y)
 * visualizar p
 */
System.out.println("Introduce un número");
x=teclado.nextInt(); 
System.out.println("Introduce un exponente");
y=teclado.nextInt(); 
i=1; p=x;

while(i<y){
	p=p*x;
	i++;
}System.out.println(p);
	}

}
