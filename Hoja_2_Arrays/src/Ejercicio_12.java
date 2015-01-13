
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
