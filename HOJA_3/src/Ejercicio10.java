import java.util.Scanner;


public class Ejercicio10 {
	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);

//ENTORNO
/*
 * n  entero introducido por teclado
 * i  contador entero
 * f1,f2 entero para calcular los números de fibonacci
 */
int n,i,f1,f2;

//PROCESO
/*
 * leer n
 * i<--1
 * f1<--1
 * f2<--2
 * 
 * while (i<n)
 * i<--i+1
 * f1<--f2-f1
 * f2<--f1+f2
 *  if(f2%2==0)
 *  visualizar f2
 *  end if
 * end while
 * 
 *  FIN
 */
System.out.println("Introduce la cantidad de numeros de la serie de Fibonacci que mostrar:");
n=teclado.nextInt();
i=1;
f1=1;
f2=1;
while(i<n){
	i++;
	f1=f2-f1;
	f2=f1+f2;
	if(f2%2==0){
	System.out.println(f2);	
	}
}
	}

}
