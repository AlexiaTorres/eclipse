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

public static void visualizarMayor(int a[], int n){
	
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
return posmenor;
}


public static int buscarMayor(int a[], int n){
	
	int posmayor=0;
	int i=1;
	int mayor=a[posmayor];
	
	while(i<=n-1){
		if(a[i]>mayor){
			posmayor=i;
			mayor=a[posmayor];
		}
		i++;
	}
	return mayor;
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


//BÚSQUEDA DE UN DATO (SECUENCIAL)

public static int busquedaSecuencial(int a[], int n, int dato){
	int i=0;
	int pos= -1;
	
while(i<=n-1 && pos==-1){
	if (a[i]==dato){
		pos=i;
	}
	i++;
}
return pos;	
	
}




//NUMERO PRIMO

public static boolean primo(int n){
	int d=1;
	int c=0;
	
	while(d<=n){
		if(n%d==0){
			c++;
		}
		d++;
	}
	if(c<=2){
		return true;
	}else{
		return false;
	}
	
	
	
	
}






}
