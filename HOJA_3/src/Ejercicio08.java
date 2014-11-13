import java.util.Scanner;


public class Ejercicio08 {
	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);

//ENTORNO
/*
 * a dividendo entero
 * b divisor entero
 * i contador
 */

int a,b,i;

//PROCESO
/*
 * leer a
 * leer b
 * i<--0
 * 
 * repeat while (a>b)
 *  a<--a-b
 *  i<--i+1
 * end while
 * visualizar i,a
 * FIN
 */

System.out.println("Introduce dividendo");
a=teclado.nextInt();
System.out.println("Introduce divisor");
b=teclado.nextInt();
i=0;

while(a>b){
	a=a-b;
	i++;
} System.out.printf("Cociente: %d \nResto: %d",i,a);

	}

}
