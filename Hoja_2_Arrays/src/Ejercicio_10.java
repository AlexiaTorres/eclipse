/*
 * Escribe un programa que dada una matriz de 3x3 realice 
 * las siguientes funciones:  
-Calcule la media de todos los valores 
-Calcule el valor mínimo y el máximo de todos los valores 
-Sumar los valores en la diagonal descendente.  
-Sumar los valores en la diagonal ascendente.  
-Sumar los valores que están por encima de la diagonal descendente.  
-Sumar los valores que están por debajo de la diagonal descendente.  
-Probarlo con la matriz  [ [1,2,3], [4,5,6], [7,8,9] ]
 */
public class Ejercicio_10 {

	//incompleto
	
	public static void main(String[] args) {
		
		int a[][]=new int [3][3];
		int suma=0;
		int c=1;
		int aux=0;
		int media=0;

		
		Metodos.llenarArrayDosDimensiones(a, a.length);
		
	//MEDIA 	
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				
				suma=suma+a[i][j];
				
			}
			c++;
			aux=aux+c;
		}
		media=suma/aux;
		System.out.println(media);
		
	}

}
