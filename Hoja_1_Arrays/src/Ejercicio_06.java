/*
 *Leer 10 números enteros, almacenarlos en un vector 
 * y determinar cuántas veces está repetido el mayor.
 */
public class Ejercicio_06 {
public static void main(String[] args) {
	int n=10;
	int a[]=new int[n];
	int i=0;
	int mayor;
	int repetido=0;
	
	MetodosArrays.llenarArray(a, n);
	MetodosArrays.visualizarArray(a, n);
	
	while(i<=n-1){
		mayor= MetodosArrays.buscarMayor(a, n);
		if(a[i]==mayor){
			repetido++;
		}
		i++;
	}
	System.out.println("El número mayor está repetido "+repetido+" veces");	
}
}
