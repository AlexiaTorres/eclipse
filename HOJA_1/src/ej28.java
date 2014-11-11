import java.util.Scanner;


public class ej28 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		//ENTORNO
		/*
		 * mes  entero del 1 al 12
		 */
		int mes;
		
		//PROCESO
		/*
		 * leer mes
		 * if (mes==2)
		   visualizar " tiene 28 días"
		   end if
		  else if(mes==4 || mes==6 || mes==9 || mes==11)       
             visualizar " tiene 30 días"
          end if
		else
         visualizar " es un mes de 31 días"
		end if
		
		FIN
		 */
		
		System.out.println("Introduce el número de mes");
		mes=teclado.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;		
		}
		if (mes==2){
			System.out.println("Tiene 28 días");
		}else if(mes==4 || mes==6 || mes==9 || mes==11){       
             System.out.println("Tiene 30 días");
		}else{
              System.out.println("Tiene 31 días");
		}
	}

}
