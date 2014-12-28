
public class Ejercicio_10 {

	public static void main(String[] args) {
		
		int n=10;
		int a[]=new int [n];
		int b[]=new int [n];

		int i=0;
		int j=0;
		
		int c=1;
		int f=1;
		
		MetodosArrays.llenarArray(a, n);
		MetodosArrays.visualizarArray(a, n);
		
		System.out.println("-----------------------");
		System.out.println("Vector de factoriales: ");
		
		while(i<=n-1 && j<=n-1){
		
			while(c<=a[i]){
				f=f*c;
				c++;
			}
			b[j]=f;
			System.out.println(j + "[" + b[j] + "]");
			j++;
			i++;
		}
	}

}
