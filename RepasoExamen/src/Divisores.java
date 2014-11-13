import java.util.Scanner;


public class Divisores {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Introduce número:");
int n=sc.nextInt();
int d=1;
int c=0;

while(c<n){
	c++;
	d++;
	if(n%d==0){
		System.out.println(d);
	}
	
}
	}

}
