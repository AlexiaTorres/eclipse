import java.util.Scanner;


public class MainArrays {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int opc=teclado.nextInt();
		switch(opc){
		case 1: 
			int a[]=new int[10];
			int n=a.length;
			int i=0;
			//int mayor;
			//int posmayor=0;
			
			//Para esto podemos usar el metodo llenarArray
			while(i<n-1){
				System.out.println("Introduce el elemento "+i);
				a[i]=teclado.nextInt();
				i++;
			}
			
			//Este seria el metodo buscarMayor
			i=1;
			int posmayor = 0
			int mayor = a[posmayor];
			while(i<n-1){
				if(a[i]>mayor){
					posmayor = i;
					mayor = a[posmayor];
					
				}
				i++;
			}
			System.out.printf("El número mayor (%d) está en la posición %d",mayor,posmayor);

		}
	}
}
