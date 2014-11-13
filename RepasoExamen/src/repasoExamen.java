import java.util.Scanner;


public class repasoExamen {
	public static void main(String[] args) { }
		
static Scanner teclado=new Scanner(System.in);

//Sacar divisores de un número
public static void divisores(int n){

int c=0;
int d=1;
while(c<n){
	c++;
	d++;
if(n%d==0){
	System.out.println(d);
}
}
	
}

public static void divisoresPares(int n){
	int c=0;
	int d=1;
	
	while(c<n){
		c++;
		d++;
	if(n%d==0){
		if(d%2==0){
			System.out.println(d);
		}else{
			System.out.println("no tiene divisores pares");
		}
		
	}
		
	}
}

//separar digitos
public static void digitos(int n){
	int digitos=0;
	while(n>0){
		n=n/10;
		digitos++;
		System.out.println(digitos);
	}
	
}

//suma de cifras separadas
public static void cifras(int n){
	int s=n%10;
	while(n>9){
		n=n/10;
		s=s+n%10;
}System.out.println(s);
	}
}
