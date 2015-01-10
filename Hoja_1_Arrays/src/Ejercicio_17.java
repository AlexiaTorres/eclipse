import java.util.Scanner;


public class Ejercicio_17 {

	public static void main(String[] args) {

Scanner teclado=new Scanner(System.in);

System.out.println("Introduce un número entero: ");
int num=teclado.nextInt();

System.out.println();
System.out.println("Se creará un array con los divisores del número introducido");
System.out.println("------------------------------------------");	

	int d=1;
	int cd=0;
	int i=0;
	
	
//CONTAR DIVISORES	
	while(d<=num){
		if(num%d==0){
			cd++;	
		}
		d++;
	}
//CREAR ARRAY DEL TAMAÑO DE LA CANTIDAD DE DIVISORES	
int a[]=new int[cd];

//RELLENAR EL ARRAY CON LOS DIVISORES
for(d=1,i=0; d<=num; d++){
	if(num%d==0){
		a[i]=d;
		i++;
	}
}
		
MetodosArrays.visualizarArray(a, cd);	
	
}
	
	
	
	
}
