/*
 * Escriba un programa que sume todos los elementos de un 
 *array de enteros. 
Utilícelo para sumar el vector:  
int[] a = {1, 2, 3, 4, 5, 6};
 */
public class Ejercicio_03 {
	public static void main(String[] args) {
	
		int a[]={1,2,3,4,5,6};
		int i=0;
		int suma=0;
		
		while(i<a.length){
			suma=suma+a[i];
			i++;
		}
		System.out.println(suma);
	}
}
