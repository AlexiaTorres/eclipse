/*
 * Escribe un programa que ordene los números de un vector. Utilizar el 
algoritmo de la burbuja y probarlo sobre los vectores [4,3,2,1] y [3,2,1,4].
 */
public class Ejercicio_12 {
	public static void main(String[] args) {
		
		int a[]={4,3,2,1};
		int b[]={3,2,1,4};
		
		Metodos.visualizarArray(a, a.length);
		Metodos.ordenaciónBurbuja(a, a.length);
		System.out.println();
		Metodos.visualizarArray(a, a.length);
		
		System.out.println("----------------------");
		
		Metodos.visualizarArray(b, b.length);
		Metodos.ordenaciónBurbuja(b, b.length);
		System.out.println();
		Metodos.visualizarArray(b, b.length);
	}
}
