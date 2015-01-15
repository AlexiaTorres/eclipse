/*
 * Leer 10 números enteros, almacenarlos en un vector 
 * y determinar en qué posición está el número con mas dígitos.
 */
public class Ejercicio_09 {

	//SOLO HE SUMADO LOS DIGITOS DE CADA ELEMENTO
	//FALTA BVUSCAR LA POSICIÓN DEL MAYOR
	
	public static void main(String[] args) {
		
		int n=4;
		int a[]=new int [n];
		int r;
		int cifras=0;
		int i=0;
		int num;
		
		MetodosArrays.llenarArray(a, n);
		MetodosArrays.visualizarArray(a, n);
		
		while(i<=n-1){
			num=a[i];
			while(num>9){
				r=num%10;
				cifras++;
				num=num/10;
			}
			cifras++;
			System.out.println(cifras);
			
			num=0;
			cifras=0;
			i++;
		}
}
}
