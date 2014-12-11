import java.util.Scanner;


public class MainOperacionesArray {

	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);

System.out.println("Para realizar los siguientes casos, primero crea y rellena un array");
System.out.println("");
System.out.println("Introduce el número de elementos que quieres en el array:");

int n=teclado.nextInt();
int a[]=new int[n]; //declarar el array a de tamaño n y tipo int

OperacionesArray.crear(a,n); //llamo al método en el que relleno el array


OperacionesArray.menu();

int opc=teclado.nextInt();
switch(opc){
case 1: 
	
	System.out.println("VISUALIZAR EL CONTENIDO DE UN ARRAY");	
	
	OperacionesArray.visualizarArray(a, n); //llamo al método visualizar array
	
break;

case 2:
	
	System.out.println("Introduce el valor que quieres introducir: ");
	int dato=teclado.nextInt();

	System.out.println("introduce la posición en la que quieras insertar el dato");
	int k=teclado.nextInt();
		
    int dd=OperacionesArray.insertarPosicionk(a, n, k, dato);
    System.out.println(dd);
    
    OperacionesArray.visualizarArray(a, n);
break;  

case 3:

	System.out.println("Introduce la posición que quieres borrar: ");
	int borrado = teclado.nextInt();
	n = OperacionesArray.borrarArray(a, n, borrado);
	
	OperacionesArray.visualizarArray(a, n);
	break;
	
case 4:
	
	System.out.println("Introduce el dato que quieras buscar: ");
	dato=teclado.nextInt();
	int pos=OperacionesArray.busquedaSecuencial(a, n, dato);
	
	System.out.printf("El dato está en la posición %d",pos);
	
	break;
	
case 5:
	
	System.out.println("Introduce el dato que quieras buscar: ");
	dato=teclado.nextInt();
	pos=OperacionesArray.busquedaCentinela(a, n, dato);
	
	System.out.printf("El dato está en la posición %d",pos);
	
	break;
	
case 6:
	
	System.out.println("Introduce el dato que quieras buscar: ");
	dato=teclado.nextInt();
	pos=OperacionesArray.busquedaBinaria(a, n, dato);
	
	System.out.printf("El dato está en la posición %d",pos);
	
	break;	
}}
}
