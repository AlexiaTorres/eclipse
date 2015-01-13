import java.util.Random;
import java.util.Scanner;


public class Metodos {
static Scanner teclado=new Scanner(System.in);

static Random rm=new Random();

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


public static void asteriscos(int veces){
	for (int i=0; i<veces; i++){
		System.out.print("*");
	}
}
	


public static void llenarArrayDosDimensiones(int a[][], int n){

for(int i=0; i<a.length; i++){
	for(int j=0; j<a[i].length; j++){
		a[i][j]= teclado.nextInt();
	}
}
}


public static void ordenaciónBurbuja(int a[], int n){
	int aux;
	for(int i=0; i<a.length-1; i++){
		for(int j=0; j<a.length-1-i; j++){
			if(a[j+1]<a[j]){
				aux=a[j+1];
				a[j+1]=a[j];
				a[j]=aux;
			}
		}
	}
}

	
}








