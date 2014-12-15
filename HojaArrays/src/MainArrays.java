import java.util.Scanner;

/* Si pones como comentario al principio lo que quieras ahacer o el enunciado del ejercico seras mejor persona*/
public class MainArrays {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int opc=teclado.nextInt();
		switch(opc){
		case 1: 
			int a[]=new int[10];
			int n=a.length;
			int indiceMenor;
			int menor;
			MetodosArrays.llenarArray(a,n);
			MetodosArrays.visualizarArray(a, n);
			MetodosArrays.visualizarMayor(a, n); //cambio de nombre del metodo
			indiceMenor=MetodosArrays.buscarMenor(a, n);
			menor = a[indiceMenor];
			System.out.println("El numero menor es "+menor+" y ocupa la posicion "+indiceMenor);
			n = MetodosArrays.borrarElemento(a, n, indiceMenor); //este metodo devuelve el numero de elementos ocupados de un array al terminar
			MetodosArrays.visualizarArray(a, n); // este n ha sido modificado en la linea anterior

			//por qué al hacer el método buscarMenor como int, con return, se me jode todo?
			
			
			
		}
	}
}
