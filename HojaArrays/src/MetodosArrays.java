import java.util.Scanner;


public class MetodosArrays {
static Scanner teclado = new Scanner(System.in);
	

public static void llenarArray(int a[], int n){
	
		int i=0;
	while(i<n-1){
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

public static void buscarMayor(int a[], int n){
	
	int i=1;
	int posmayor = 0;
	int mayor = a[posmayor];
	while(i<n-1){
		if(a[i]>mayor){
			posmayor = i;
			mayor = a[posmayor];
			
		}
		i++;
	}
	System.out.printf("El número mayor (%d) está en la posición %d",mayor,posmayor);

}

public static int buscarMenor(int a[], int n){
	
	int i=1;
	int posmenor = 0;
	int menor = a[posmenor];
	while(i<n-1){
		if(a[i]<menor){
			posmenor = i;
			menor = a[posmenor];
			
		}
		i++;
	}
return menor;
}

public static void borrarElemento(int a[],int n,int dato){
	
	int i = dato;
	
	while(i<=n-2){
		a[i]=a[i+1];
		i++;
	}
	n--;
}


}
