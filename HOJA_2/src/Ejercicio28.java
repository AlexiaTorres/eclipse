import java.util.Scanner;


public class Ejercicio28 {
	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);
// TODO Auto-generated method stub

int n;
int d;

System.out.println("Introduce un número para ver sus divisores:");
n=teclado.nextInt();
d=0;

while(d<n){
	d++;
	if(n%d==0){
System.out.println(d);
}
}
	}

}
