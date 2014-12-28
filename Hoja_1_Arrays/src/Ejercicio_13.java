
public class Ejercicio_13 {

	public static void main(String[] args) {

		int n=10;
		int a[]=new int [n];
		int i=0;
		
		MetodosArrays.llenarArray(a, n);
		MetodosArrays.visualizarArray(a, n);

		while(i<=n-1){
			if(a[i]%2==0){
				a[i]=0;
			}
			i++;
		}

		System.out.println("\n----------------");
		MetodosArrays.visualizarArray(a, n);
		
	}

}



