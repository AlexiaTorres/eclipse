
public class Ejercicio_08 {

	//SUMAR CIFRAS DE CADA ELEMENTO DEL ARRAY
	//ME FALTA LO DE LA POSICION DEL MAYOR
	
	public static void main(String[] args) {

		int n=5;
		int a[]=new int [n];
		int i=0;
		int r;
		int suma=0;
		int num;
		
		MetodosArrays.llenarArray(a, n);
		MetodosArrays.visualizarArray(a, n);
		
		while(i<=n-1){
			
			num=a[i];
			while(num>9){
				r=num%10;
				suma=suma+r;
				num=num/10;
			}
			suma=suma+num;
			System.out.println(suma);
			
			suma=0;
			
			i++;
		}
		
	

		

	}

}
