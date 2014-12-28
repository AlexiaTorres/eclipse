
public class Ejercicio_11 {

	public static void main(String[] args) {
		
		int n=10;
		int a[]=new int [n];
		int i=0;
		int cont=0;
		
		MetodosArrays.llenarArray(a, n);
		MetodosArrays.visualizarArray(a, n);

		while(i<=n-1){
			if(a[i]%100==15){
				cont++;
			}
			i++;
		}
		System.out.printf("\nHay %d números que terminan en 15",cont);
		
	}

}
