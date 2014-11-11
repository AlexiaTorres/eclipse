import java.util.Scanner;


public class Ejercicio08 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		//ENTORNO
		/*
		 * mes  entero de 1 a 12
		 */
		int mes;
		
		//PROCESO
		/*
		 * leer mes
		 * if (mes==2)
		   visualizar " 28 días"
		   end if
		  else if(mes==4 || mes==6 || mes==9 || mes==11)       
             visualizar " 30 días"
          end if
		else
         visualizar " 31 días"
		end if
		
		FIN
		 */
		
		System.out.println("Introduce el mes");
		mes=teclado.nextInt();
		
		if (mes==2){
			System.out.println("Tiene 28 días");
		}else if(mes==4 || mes==6 || mes==9 || mes==11){       
             System.out.println("Tiene 30 días");
		}else{
              System.out.println("Tiene 31 días");
		}

	}

}
