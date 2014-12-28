import java.util.Scanner;

//LA TABULACIÓN ME IGNORA O YO NO SÉ USARLA

public class Ejercicio_14 {

	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);

//DECLARACIÓN	

    System.out.println("Introduce el número de columnas:");
	int n=teclado.nextInt(); //columnas
	
   System.out.println("Introduce el número de filas:");		
   int m=teclado.nextInt(); //filas
 
	char a[][]=new char[n][m];
	
//ASIGNAR VALOR
	

	//i recorre las columnas(n) y j recorre las filas(m)
	
	for(int i=0; i<a.length; i++){
		for(int j=0; j<a[i].length; j++){
			a[i][j]='*';	
		}
	}
	
//REPRESENTAR
	
	for(int i=0; i<a.length; i++){
		for(int j=0; j<a[i].length; j++){
			System.out.println(a[i][j]);
		}
		System.out.println("\t");
	}
	
	
    }
 
}