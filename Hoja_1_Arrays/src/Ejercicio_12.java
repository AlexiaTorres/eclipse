/*
 *Diseñar una función que nos permita eliminar de un array 
 * de números enteros todos aquellos elementos  iguales a uno dado
 */

import java.util.Scanner;

//HE RELLENADO CON 0 EL ESPACIO DEL DATO BORRADO

public class Ejercicio_12 {
	public static void main(String[] args) {
Scanner teclado= new Scanner(System.in);

		int n=10;
		int a[]=new int [n];
		int i=0;
		int pos=-1;
		int dato;
				
		MetodosArrays.llenarArray(a, n);
		MetodosArrays.visualizarArray(a, n);
		
		System.out.println("Introduce el número que quieras borrar del array:");
		dato=teclado.nextInt();
		
		while(i<=n-1){
			if(a[i]==dato){
				pos=i;
				a[i]=0;
			}
			i++;
		}
		MetodosArrays.visualizarArray(a, n);
	}
}
