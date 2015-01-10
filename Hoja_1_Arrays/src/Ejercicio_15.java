import java.util.Random;
import java.util.Scanner;


public class Ejercicio_15 {

	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);
Random rdm=new Random();

int n=10;
int a[]=new int[n];
int dato;
int i=0;
int posiciones[];

//RELLENAR ARRAY CON NÚMEROS ALEATORIOS

while(i<=n-1){
	a[i]=rdm.nextInt(20);
	i++;
}


MetodosArrays.visualizarArray(a, n);


System.out.println("Introduce un dato para buscarlo en el array y mostrar otro con las posiciones en las que se encuentra:");
dato=teclado.nextInt();

buscar(a,n,dato);



	}

	
	

public static void buscar(int a[], int n, int dato){

	int veces=0;
	int j=0;
	int posiciones[];
	
	int i=0;
	
	
	while(i<=n-1){
		if(a[i]==dato){
			veces++;
		}	
	}
	
	posiciones=new int[veces];
	
while(j<=veces-1){	
	
		if(a[i]==dato){
			
			posiciones[j]=i;
			j++;
		}
		
	i++;
	
	}

MetodosArrays.visualizarArray(posiciones, veces);

}

	
	
	
	
}
