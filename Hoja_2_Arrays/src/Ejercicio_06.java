import java.util.Scanner;


public class Ejercicio_06 {

	public static void main(String[] args) {
Scanner teclado= new Scanner(System.in);
System.out.println("Introduce un número para crear un array de ese tamaño:");
            int n=teclado.nextInt();
            int a[]=new int[n];
            int i=0;
            int j=0;
            
        Metodos.llenarArray(a, n);
            
   
      while(i <n){
			for (j=0; j<a[i]; j++){
			  System.out.print('*');
			}
			System.out.println();
			i++;	
		}      
      
	}	
}
