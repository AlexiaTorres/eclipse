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
		   visualizar " 28 d�as"
		   end if
		  else if(mes==4 || mes==6 || mes==9 || mes==11)       
             visualizar " 30 d�as"
          end if
		else
         visualizar " 31 d�as"
		end if
		
		FIN
		 */
		
		System.out.println("Introduce el mes");
		mes=teclado.nextInt();
		
		if (mes==2){
			System.out.println("Tiene 28 d�as");
		}else if(mes==4 || mes==6 || mes==9 || mes==11){       
             System.out.println("Tiene 30 d�as");
		}else{
              System.out.println("Tiene 31 d�as");
		}

	}

}
