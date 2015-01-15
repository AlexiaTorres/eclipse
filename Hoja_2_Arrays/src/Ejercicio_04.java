/*
 * Hacer un programa que dados dos arrays determine si son iguales. 
 * Probarlo con los arrays [1,2,3] y [1,2,3], 
 * [1,2,3,4] y [1,2,3] y [1,2,3] y [1,2,2] 
 */
public class Ejercicio_04 {
	public static void main(String[] args) {

		int a[]={1,2,3};
		int b[]={1,2,3};
        int c[]={1,2,3,4};
        int d[]={1,2,2};
		
		boolean igual=Metodos.iguales(a,b);
		      
	if(igual){
		System.out.println("los arrays a y b son iguales");
	}else{
		System.out.println("Los arrays a y b son distintos");
	}
		
	  igual=Metodos.iguales(c,a);
      
		if(igual){
			System.out.println("los arrays c y a son iguales");
		}else{
			System.out.println("Los arrays c y a son distintos");
		}
		
	  igual=Metodos.iguales(a,d);

		if(igual){
			System.out.println("los arrays a y d son iguales");
		}else{
			System.out.println("Los arrays a y d son distintos");
		}	
	}
}
