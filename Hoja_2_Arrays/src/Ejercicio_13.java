/*
 *Escriba un programa que, dado un array de enteros, busque si un número 
obtenido por la entrada estándar se encuentra en el array e imprima la 
primera posición en la que se encuentra el número.  
 */

import java.util.Scanner;

public class Ejercicio_13 {
	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);

		System.out.println("Introduce tamaño del array:");

		int n=teclado.nextInt();
		int a[]=new int[n];
		int num;
		int i=0;
		
		Metodos.llenarArray(a, n);
		
		System.out.println("Introduce el número que quieras buscar en el array:");
		num=teclado.nextInt();
		
		while(i<=n-1){
			if(a[i]==num){
				System.out.printf("El número %d está en la posición %d", num,i);
			}
			
			i++;
		}
	}
}
