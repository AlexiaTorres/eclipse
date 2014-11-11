import java.util.Scanner;


public class ej7 {
	public static void main(String[] args) {
		int c=16;
		System.out.println(c + (c>0 ? " es positivo" : " es negativo"));
		System.out.println(c + (c%2==0 ? " es par" : " es impar"));
	    System.out.println(c + (c%5==0 ? " multiplo de 5" : " no multiplo de 5"));
	    System.out.println(c + (c%10==0 ? " multiplo de 10" : " no multiplo de 10"));
	    System.out.println(c + (c>100 ? " mayoe que 100" : " menor que 100"));

	    Scanner teclado= new Scanner(System.in);
	    int a = teclado.nextInt();
	    int b= teclado.nextInt();
	
	    System.out.println(a);
        System.out.println(b);
	}
}
