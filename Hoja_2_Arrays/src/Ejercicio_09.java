import java.util.Scanner;


public class Ejercicio_09 {

	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	
	System.out.println("Introduce el tamaño del array: ");
	int n=teclado.nextInt();	
	int a[]=new int[n];
	int num=1;
	int veces;
	int i;
	
	System.out.println("Ahora los números que contendrá (del 1 al 100) (pueden repetirse)");
	Metodos.llenarArray(a, n);
	Metodos.visualizarArray(a, n);
	
	while(num<99){
        veces=0;
		i=0;
		while(i<=n-1){
			if(num==a[i]){
				veces++;
				System.out.print(a[i]+": ");
				Metodos.asteriscos(veces);
				System.out.println();
			}

			i++;
			
		}

		num++;
	}
	
	

	

	}

	

	
}
