/*
 *Leer 10 números enteros, almacenarlos en un vector y determinar 
 * en qué posiciones se encuentran los números terminados en 4.
 */
public class Ejercicio_05 {
	public static void main(String[] args) {

		int n=10;
		int a[]=new int[n];
		int i=0;
		
		MetodosArrays.llenarArray(a, n);
		
		System.out.println("Los elementos del array, terminados en 4, se encuentran en las posiciones:");
		while(i<=n-1){
			if(a[i]%10==4){
				System.out.println(i);
			}
			i++;
		}
	}
}
