import java.util.Scanner;


public class Ejercicio16 {
	public static void main(String[] args) {
 Scanner teclado=new Scanner(System.in); 
 int n=teclado.nextInt();
int a []= new int [n];
  
int i=0;
int j=1;
while(i<n){
a[i]=j;
System.out.printf("\t%d",a[i]);
i++;
j++;
}


	}

}
