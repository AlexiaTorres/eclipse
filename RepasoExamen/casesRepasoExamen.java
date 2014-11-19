import java.util.Scanner;


public class casesRepasoExamen {

	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);	
System.out.println("Número de ejercicio:");
		int opc=teclado.nextInt();
		switch (opc) {
		case 1:
			System.out.println("Introduce un número para ver sus divisores:");	
			int n=teclado.nextInt();
			repasoExamen.divisores(n);
			break;
		case 2: 
			System.out.println("Introduce un número para ver sus divisores pares:");	
			n=teclado.nextInt();
			repasoExamen.divisoresPares(n);
			break;
	
		case 3: 
			System.out.println("Introduce un número para separar sus dígitos:");	
			n=teclado.nextInt();
			repasoExamen.digitos(n);
			break;	
			
		case 4: 
			System.out.println("Introduce un número para ver la suma de sus dígitos:");	
			n=teclado.nextInt();
			repasoExamen.cifras(n);
			break;	
		
		case 5: 
			System.out.println("Introduce un número:");	
			n=teclado.nextInt();
			repasoExamen.cifraAlReves(n);
			break;		
	
		case 6:
			System.out.println("oc");

		default:
			break;
		}
				

	}

}
