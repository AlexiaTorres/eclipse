/*
 * Diseñar una función buscar()que busque un dato en un array de números 
 * enteros y devuelva una referencia a un array que contiene las 
 * posiciones donde se encuentra el dato buscado. 
 * El tamaño del array será exactamente igual al número de 
 * veces que se encuentre el elemento buscado
 */

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_15 {
	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);
Random rdm=new Random();

int n=10;
int a[]=new int[n];
int dato;
int i=0;

//RELLENAR ARRAY CON NÚMEROS ALEATORIOS

while(i<=n-1){
	a[i]=rdm.nextInt(20);
	i++;
}

MetodosArrays.visualizarArray(a, n);

System.out.println("Introduce un dato para buscarlo en el array y mostrar otro con las posiciones en las que se encuentra:");
dato=teclado.nextInt();

buscar(a,n,dato);
	
}

	
//------------------------------------------------------------	

public static void buscar(int a[], int n, int dato){

	int veces=0;
    int i=0;
	int j=0;
	
	while(i<=n-1){
		if(a[i]==dato){
			veces++;
		}	
		i++;
	}

	int posiciones[]=new int[veces];
	i=0;
	
while(j<=veces-1){	
	while(i<=n-1){	
	
		if(a[i]==dato){
			posiciones[j]=i;
			System.out.println("["+posiciones[j]+"]");
		}
	i++;
	}
	j++;
}

}	
}
