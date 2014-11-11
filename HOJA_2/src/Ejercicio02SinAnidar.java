import java.util.Scanner;


public class Ejercicio02SinAnidar {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		//ENTORNO
		/*
		 * nota real
		 */
		double nota;
		
		//PROCESO
		/*
		 * Visualizar "Introducir nota del alumno:"
		 * Leer nota
		 * 
		 * SIN CONDICIONES ANIDADAS
		 * if (nota>=9)
		 * visualizar "sobresaliente"
		 * end if
		 * if nota>=7 && nota<9)
		 * visualizar "notable"
		 * end if
		 * if nota>=5 && nota<7)
		 * visualizar "aprobado"
		 * end if
		 * if nota>=3 && nota<5)
		 * visualizar "insuficiente"
		 * end if
		 * if nota>=0 && nota<3)
		 * visualizar "muy deficiente"
		 * end if
		 * 
		 * FIN 
		 */
		
		System.out.println("Introducir nota del alumno: ");
		nota=teclado.nextDouble();
		
		//Sin condiciones anidadas:
		if (nota>=9){
			System.out.println("Sobresaliente");
		}
		if (nota>=7 && nota<9){
			System.out.println("Notable");
		}
		if (nota>=5 && nota<7){
			System.out.println("Aprobado");
		}
		if (nota >=3 && nota<5){
			System.out.println("Insuficiente");
		}
		if (nota >=0 && nota<3){
			System.out.println("Muy deficiente");
		}

		
	}
	}
