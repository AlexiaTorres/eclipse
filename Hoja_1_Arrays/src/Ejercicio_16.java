/*
 *Diseñar una función Borrar () que permita borrar un dato 
 * almacenado en un array, que reciba la referencia a un 
 * array de números enteros , el número de elementos 
 * del array y el dato que queremos borrar.
 */

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_16 {
	public static void main(String[] args) {

Scanner teclado=new Scanner(System.in);
Random rm=new Random();

int n=10;
int a[]=new int[n];
int dato;

for(int i=0; i<=n-1; i++){
	a[i]=rm.nextInt(20);
	System.out.println(i+" ["+a[i]+"]");
}

System.out.println("Introduce el dato que quieras borrar del array:");
dato=teclado.nextInt();
borrar(a,n,dato);
MetodosArrays.visualizarArray(a, n);

}
	
//----------------------------------------------------------
	public static void borrar (int a[], int n, int dato){
		
		int i = dato;
		
		while(i<=n-2){
			a[i]=a[i+1];
			i++;
		}
		a[n-1]=0;
		n--;
		}
}