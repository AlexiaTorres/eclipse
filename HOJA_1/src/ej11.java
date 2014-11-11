import java.util.Scanner;


public class ej11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//ENTORNO
		/*
		 * km número real
		 * m número real
		 */
		
		double km=sc.nextDouble();
		double m=km*1000/3600;
		
		//PROCESO
		/*
		 * leer km
		 * m <-- km*1000/3600
		 * visualizar "km km/h = m m/s"
		 */
		System.out.println(km + "km/h = " + m + "m/s");

	}

}
