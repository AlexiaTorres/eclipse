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
			int mayor;
			int posmayor=0;
			while(i<n-1){
				System.out.println("Introduce el elemento "+i);
				a[i]=teclado.nextInt();
				i++;
			}

			i=1;
			mayor=a[0];
			while(i<n-1){
				if(a[i]>mayor){
					mayor=a[i];
					//posmayor=i;
					//System.out.println(posmayor);
				}
				
				i++;
			}
			System.out.printf("El número mayor (%d) está en la posición %d",mayor,posmayor);
			System.out.println(a[i]);

		}
	}
}
