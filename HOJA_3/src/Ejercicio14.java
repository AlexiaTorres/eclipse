import java.util.Scanner;


public class Ejercicio14 {
	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);

int n,suma;

System.out.println("Introduce un número para ver la suma de sus cifras:");
n=teclado.nextInt();
suma=n%10;

while(n>9){
	n=n/10;
suma=suma+n%10;
System.out.println(suma);
}


	

	}

}
