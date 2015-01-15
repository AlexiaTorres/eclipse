/*
 * Escriba un programa que lea de la entrada un número y utilice ese número 
para crear un array de enteros de ese tamaño. A continuación, el programa 
inicializará el array con los valores que el usuario introduzca por la entrada. 
Finalmente, se deberá recorrer el array e imprimir tantos caracteres ‘*’ como 
indique el valor de cada elemento del array. Ejemplo: los valores 5,4,3,2 
producirán la siguiente salida: 
***** 
**** 
*** 
** 
 */
import java.util.Scanner;

public class Ejercicio_06 {

	public static void main(String[] args) {
Scanner teclado= new Scanner(System.in);
System.out.println("Introduce un número para crear un array de ese tamaño:");
            int n=teclado.nextInt();
            int a[]=new int[n];
            int i=0;
            int j=0;
            
        Metodos.llenarArray(a, n);
            
   
      while(i <n){
			for (j=0; j<a[i]; j++){
			  System.out.print('*');
			}
			System.out.println();
			i++;	
		}      
      
	}	
}
