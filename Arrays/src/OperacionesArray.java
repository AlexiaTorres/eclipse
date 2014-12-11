import java.util.Scanner;

/*
 * tipodedato [] nombre = new mismotipodedato [tamaño];
 *     ó
 * tipodedato [] nombre = {contenido };
 * ej:  int []numeros={1,5,3,8};
 *     
 */

public class OperacionesArray {
static Scanner teclado=new Scanner(System.in);

//MENU
public static void menu(){
System.out.println("Para visualizar el array creado --> 1");
System.out.println("Para insertar un nuevo valor --> 2");
System.out.println("Para borrar un elemento --> 3");
System.out.println("Para buscar un dato mediante búsqueda secuencial --> 4");
System.out.println("Para buscar un dato mediante técnica del centinela --> 5");
System.out.println("Para buscar un dato mediante búsqueda binaria --> 6");
}



//CREAR Y RELLENAR UN ARRAY


public static int crear (int a[],int n){
	
	int i=0;

while(i<=n-1){
	System.out.printf("Introduce valor para el elemento %d ",i);
	a[i]=teclado.nextInt();
	i++;
}	
	
	return n;
}


//VISUALIZAR ELEMENTOS DEL ARRAY

public static void visualizarArray (int a[], int n){
	
	int i=0;
	while(i<=n-1){
		System.out.println(i + "[" + a[i] + "]");
		i++;
	}
	
}


//INSERTAR UN DATO EN UNA POSICIÓN K

public static int insertarPosicionk(int a[], int n, int k, int dato){
	
	int i=n-1;
	while(i>=k){
		i--; //i-- arriba, sino hay desbordamiento!!
		a[i+1]=a[i];
		
	}
	a[k]=dato;
	n++;
	return n;
	
	
}


//BORRAR DATO DE UN ARRAY

public static int borrarArray(int a[],int n,int datoBorrado){
	
	int i = datoBorrado;
	
	while(i<=n-2){
		a[i]=a[i+1];
		i++;
	}
	n--;
	return n;
}


//BÚSQUEDA SECUENCIAL (array ordenado o desordenado)

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


//TÉCNICA DEL CENTINELA (array ordenado o desordenado)

public static int busquedaCentinela(int a[], int n, int dato){
	a[n]=dato;
	int pos=0;
	
	while(a[pos] != dato){
		pos++;
	}
	if (pos==n){
		pos = -1;
	}
	return pos;
}


//BÚSQUEDA BINARIA (array desordenado)

public static int busquedaBinaria(int a[], int n, int dato){
	
	int p,f,medio,pos;
	p=0;
	f=n-1;
	medio= (p+f)/2;
	
	while(p<=f && a[medio] != dato){
		if(dato < a[medio]){
			f = medio - 1;
		}else{
			p = medio + 1;
		}
		medio=(p+f)/2;
	}
	if(a[medio]==dato){
		pos = medio;
	}else{
		pos = -1;
	}
	
	return pos;
	
	
}



}


