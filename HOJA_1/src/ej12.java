import java.util.Scanner;


public class ej12 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//ENTORNO
		/*
		 * c1 real
		 * c2 real
		 * h real
		 */
		
		double c1=sc.nextDouble();
		double c2=sc.nextDouble();
		double h= Math.sqrt(Math.pow(c1, 2)+Math.pow(c2, 2));
		
		//PROCESO
		/*
		 * leer c1
		 * leer c2
		 * h <-- sqrt(c1^2 + c2^2)
		 * visualizar h
		 * 
		 * FIN
		 */
		System.out.println("Hipotenusa = " + h);

	}

}
