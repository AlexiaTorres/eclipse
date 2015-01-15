/*
 * Escribir un programa que lea un número de enteros entre 1 y 100 de la 
entrada estándar y genere un histograma con las frecuencias de cada entero 
en la secuencia.  Para representar las barras del histograma utilizar 
secuencias del carácter ‘*’. Por ejemplo, la secuencia: 1, 1, 20, 1, 2, 20, 3, 3, 
3,4,4,4,33,3  generaría la siguiente salida: 
 
1: *** 
2: * 
3: **** 
4: *** 
20:** 
33:* 
 */

import java.util.Scanner;

public class Ejercicio_09 {
	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	
	System.out.println("Introduce el tamaño del array: ");
	int n=teclado.nextInt();	
	int a[]=new int[n];
	int num=1;
	int veces;
	int i;
	
	System.out.println("Ahora los números que contendrá (del 1 al 100) (pueden repetirse)");
	Metodos.llenarArray(a, n);
	Metodos.visualizarArray(a, n);
	
	while(num<99){
        veces=0;
		i=0;
		while(i<=n-1){
			if(num==a[i]){
				veces++;
				System.out.print(a[i]+": ");
				Metodos.asteriscos(veces);
				System.out.println();
			}
			i++;
		}
		num++;
	}
}
}
