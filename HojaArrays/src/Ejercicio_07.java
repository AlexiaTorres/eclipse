
public class Ejercicio_07 {

	public static void main(String[] args) {
		
		int n=10;
		int a[]=new int[n];
		int i=0;
		int suma=0;
		int prom;
		
		MetodosArrays.llenarArray(a, n);
		MetodosArrays.visualizarArray(a, n);

		while(i<=n-1){
			suma=suma+a[i];
			i++;
		}
		prom=suma/n;
		
		while(i<=n-1){
			if(a[i]==prom){
				System.out.printf("El promedio (%d) está almacenado en el vector",prom);
			}else{
				System.out.printf("El promedio (%d) no está almacenado en el vector",prom);				
			}
			i++;
		}
		
	}

}
