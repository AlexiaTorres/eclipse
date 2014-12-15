import java.util.Scanner;


public class MainArrays {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int opc=teclado.nextInt();
		switch(opc){
		case 1: 
			int a[]=new int[10];
			int n=a.length;
			int menor;
			MetodosArrays.llenarArray(a,n);
			MetodosArrays.visualizarArray(a, n);
			MetodosArrays.buscarMayor(a, n);
			menor=MetodosArrays.buscarMenor(a, n);
			MetodosArrays.borrarElemento(a, n, menor);
			MetodosArrays.visualizarArray(a, n);

			//por qué al hacer el método buscarMenor como int, con return, se me jode todo?
			
			
			
		}
	}
}