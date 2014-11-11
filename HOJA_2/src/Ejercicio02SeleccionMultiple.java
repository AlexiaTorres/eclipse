import java.util.Scanner;


public class Ejercicio02SeleccionMultiple {
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		//ENTORNO
		/*
		 * nota entero
		 */
		int nota;
		
		//PROCESO
		/*
		 * Visualizar "Introducir nota"
		 * Leer nota
		 * switch nota
		 *  caso 0: visualizar "muy deficiente"
		 *   fin caso 0
		 *  caso 1: visualizar "muy deficiente"
		 *   fin caso 1
		 *  caso 2: visualizar "muy deficiente"
		 *   fin caso 2
		 *  caso 3: visualizar "insuficiente"
		 *   fin caso 3
		 *  caso 4: visualizar "insuficiente"
		 *   fin caso 4
		 *  caso 5: visualizar "aprobado"
		 *   fin caso 5
		 *  caso 6: visualizar "aprobado"
		 *   fin caso 6
		 *  caso 7: visualizar "notable"
		 *   fin caso 7
		 *  caso 8: visualizar "notable"
		 *   fin caso 8
		 *  caso 9: visualizar "sobresaliente"
		 *   fin caso 9
		 *  caso 10: visualizar "sobresaliente"
		 *   fin caso 10
		 *  fin switch
		 *  
		 *  FIN
		 */

		System.out.println("Introducir nota:");
		nota=teclado.nextInt();
		
		switch(nota){
		case 0:System.out.println("Muy deficiente");
		    break;
		case 1:System.out.println("Muy deficiente");
			break;
		case 2:System.out.println("Muy deficiente");
		    break;
		case 3:System.out.println("Insuficiente");
		    break;
		case 4:System.out.println("insuficiente");
		    break;
		case 5:System.out.println("Aprobado");
		    break;
		case 6:System.out.println("Aprobado");
		    break;
		case 7:System.out.println("Notable");
		    break;
		case 8:System.out.println("Notable");
		    break;
		case 9:System.out.println("Sobresaliente");
		    break;
		case 10:System.out.println("Sobresaliente");
		    break;
		}
	}

}
