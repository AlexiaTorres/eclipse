import java.util.Scanner;


public class ej27 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		//ENTORNO
		/*
		 * h,m,s enteros
		 */
		int h,m,s;
		//PROCESO
		/*
		 * leer h
		 * leer m
		 * leer s
		 * if (h>=00 && h<=24 && m>=00 && m<=60 && s>=0 && s<=60)
		 * visualizar "h:m:s"
		 * else
		 * visualizar "la hora es inválida"
		 * end if
		 * 
		 * FIN
		 */
		
		h=teclado.nextInt();
		m=teclado.nextInt();
		s=teclado.nextInt();
		
		if (h>=00 && h<=24 && m>=00 && m<=60 && s>=0 && s<=60){
	     System.out.println(h + ":" + m + ":" + s);
		}else{
			System.out.println("La hora es inválida");
		}

	}

}
