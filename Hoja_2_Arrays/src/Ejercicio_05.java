import java.util.Scanner;


public class Ejercicio_05 {

	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);
		System.out.println("Vamos a crear dos arrays, ntroduce el tamaño que quieres que tengan");
	int n=teclado.nextInt();
	int m=n;
	int x=n;
	int a[]=new int [n];
	int b[]=new int[m];
	int c[]=new int[x];
	int i = 0,j=0;
	
	System.out.println("Primer array: ");
	Metodos.llenarArray(a, n);
	System.out.println("Segundo array: ");
	Metodos.llenarArray(b, m);
	
	while(i<=n-1){
		c[i]=a[i]*b[i];
		i++;
	}
	
	Metodos.visualizarArray(a, n);
	System.out.println("\t * ");
	Metodos.visualizarArray(b, m);
	System.out.println("\t = ");
	Metodos.visualizarArray(c, x);
	
	}

}
