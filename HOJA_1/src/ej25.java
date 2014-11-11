import java.util.Scanner;


public class ej25 {
	public static void main(String[] args) {
     Scanner teclado=new Scanner(System.in);
     
     //ENTORNO
     /*
      * a,b enteros
      * r real
      */

     int a,b;
     double r;
     //PROCESO
     /*
      * leer a
      * leer b
      * if (a!=0)
      * r <-- b/a
      * visualizar r
      * else
      * visualizar "Error: el divisor no puede ser 0"
      * end if
      * 
      * FIN 
      */
     
     System.out.println("Introduce el divisor: ");
     a=teclado.nextInt();
     System.out.println("Introduce el dividendo:");
	 b=teclado.nextInt();
	 
	 if (a!=0){
		 r=b/a;
		 System.out.println(r);
	 }else{
		 System.out.println("ERROR: el divisor no puede ser 0");
	 }
	 
	 
	}

}
