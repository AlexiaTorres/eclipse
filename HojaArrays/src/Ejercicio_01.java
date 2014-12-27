public class Ejercicio_01 {

	public static void main(String[] args) {
		
		int n=10;
		int a[]=new int[n];

			int menor;
			
			MetodosArrays.llenarArray(a, n);
			MetodosArrays.visualizarArray(a, n);
		System.out.println("----------------------------");	
			MetodosArrays.visualizarMayor(a, n);
		System.out.println("\n--------------------------");	
	  menor=MetodosArrays.buscarMenor(a,n);
			MetodosArrays.borrarElemento(a, n, menor);
			MetodosArrays.visualizarArray(a, n);

	}
}