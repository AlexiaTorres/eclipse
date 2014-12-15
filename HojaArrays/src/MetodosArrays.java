import java.util.Scanner;


public class MetodosArrays {
static Scanner teclado = new Scanner(System.in);
	
// (i <= n-1)  es equivalente a (i < n), pero ten cuidado xq si utilizas n-1 tiene que ser menor o igual
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

public static void visualizaMayor(int a[], int n){  //le cambiamos el nombre a buscar x visualizar ya que no devuelve nada
	
	int i=1;
	int posmayor = 0;
	int mayor = a[posmayor];
	while(i<=n-1){
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
	while(i<=n-1){
		if(a[i]<menor){
			posmenor = i;
			menor = a[posmenor];
			
		}
		i++;
	}
return posmenor; //cambiamos el metodo para que devuelva la posicion que ocupa el numero menor,
		// si luego queremos un metodo que nos devuelva el menor valor de un array haremos le metodo
		// buscarMenorDato
}

public static void borrarElemento(int a[],int n,int dato){
	
	int i = dato;
	
	while(i<=n-2){
		a[i]=a[i+1];
		i++;
	}
	a[n-1] = 0; //esto ya es para rizar el rizo, piesna en un array de 7 posiciones con cinco ocupadas seria asi
 	            //4   6   7   9   12    0     0     si no hacemos a[n-1] = 0, y le quitamos la posicion 2 quedaria asi
 	            //4   6   9   12  12    0     0
 	            // si hacemos a[n-1] = 0 quedaria asi
 	            //4   6   9   12   0    0     0
	
	n--;
}


}
