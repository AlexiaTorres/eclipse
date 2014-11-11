import java.util.Scanner;


public class Ejercicio02Anidadas {
	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
		
		//ENTORNO
		/*
		 * nota real
		 */
		double nota;
		
		//PROCESO
		/*
		 * Visualizar "Introducir una nota"
		 * Leer nota
		 ****hecho a papel para entenderme mejor***
		 *
		 */
		
		System.out.println("Introducir una nota:");
		nota=teclado.nextDouble();
		
		if (nota>=9){
		System.out.println("Sobresaliente");
		}else{
			if (nota>=7 && nota<9){
			System.out.println("Notable");
			} else {
			 if (nota >=5 && nota<7){
			 System.out.println("Aprobado");	
			  }else{
				if (nota>=3 && nota <5){
				System.out.println("Insuficiente");
				  }else{
				    if (nota>=0 && nota <3){
					System.out.println("Muy deficiente");
					}
					   }
					}
					 }
				}

	}

}
