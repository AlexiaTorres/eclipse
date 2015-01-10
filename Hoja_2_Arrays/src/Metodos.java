import java.util.Scanner;


public class Metodos {
static Scanner teclado=new Scanner(System.in);

	public static void llenarArray(int a[], int n){
		
		int i=0;
	while(i<=n-1){
		System.out.println("Introduce el elemento "+i);
		a[i]=teclado.nextInt();
		i++;
	}	
	}
	
public static void visualizarArray (int a[], int n){
	
	int i=0;
	while(i<=n-1){
		System.out.println(i + "[" + a[i] + "]");
		i++;
	}
}



public static boolean iguales(int a[], int b[]){

boolean igual = false;

if (a.length == b.length){
    igual=true; 
}
for(int i=0; (i<a.length) && (igual);i++){
	if (a[i] != b[i]){
		igual= false;
	}
}
return igual;
}


}
