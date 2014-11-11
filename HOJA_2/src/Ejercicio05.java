
public class Ejercicio05 {
	public static void main(String[] args) {
		
		//ENTORNO
		/*
		 * a,b valor entero
		 */
		int a,b;
		
		//PROCESO
		/*
		 * a <-- 2
		 * b <-- 11
		 * visualizar "contenido inicial"
		 * visualizar a,b
		 * a <-- b
		 * b <-- a
		 * visualizar "contenido intercambiado"
		 * visualizar a,b
		 * 
		 * FIN
		 */
		a=2;
		b=11;
		System.out.println("Contenido inicial:");
		System.out.printf("a= %d  b= %d", a,b);
		a=b;
		b=a;
		System.out.println("\nContenido intercambiado:");
		System.out.printf("a= %d  b= %d", a,b);
		
	}

}
