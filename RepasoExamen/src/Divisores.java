import java.util.Scanner;


public class Divisores {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Introduce número:");
int n=sc.nextInt();
int digitos=0;
while(n>0){
	n=n/10;
	digitos++;
	
}System.out.println(digitos);

}
}