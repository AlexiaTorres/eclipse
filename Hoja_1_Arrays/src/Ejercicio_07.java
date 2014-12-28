
public class Ejercicio_07 {

	public static void main(String[] args) {
		
		int n=10;
		int a[]=new int[n];
		int i=0;
		int suma=0;
		int prom;
		boolean promedioEncontrado;
		
		MetodosArrays.llenarArray(a, n);
		MetodosArrays.visualizarArray(a, n);

		while(i<=n-1){
			suma=suma+a[i];
			i++;
		}
		prom=suma/n;
		
		promedioEncontrado=MetodosArrays.busquedaConBoolean(a, n, prom);
		
		
			if (promedioEncontrado){
			System.out.printf("El promedio (%d) está almacenado en el vector",prom);
		    }else{
			System.out.printf("El promedio (%d) no está almacenado en el vector",prom);				
		    }
		
		
	}

}
