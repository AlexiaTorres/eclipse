import java.util.Scanner;


public class ej10 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		//ENTORNO
		/*
		 * radio real
		 * longitud real
		 * area real
		 */
		
		double radio=teclado.nextDouble();
		double longitud= 2*Math.PI*radio;
		double area=Math.PI* Math.pow(radio, 2);

		//PROCESO
		/*
		 * leer radio
		 * longitud <-- 2*pi*radio
		 * area <-- pi*radio^2
		 * visualizar radio
		 * visualizar longitud
		 * visualizar area
		 * 
		 * FIN
		 */
		
		System.out.println("Radio= " + radio);
		System.out.println("Longitud = " + longitud);
		System.out.println("Area = " + area);
	}

}
