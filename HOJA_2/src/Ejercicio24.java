import java.util.Scanner;


public class Ejercicio24 {
	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);

		//ENTORNO
		/*
		 * n  entero
		 * c entero
		 * suma  entero
		 * media  entero
		 */
        int n,c,suma,media;
        
        //PROCESO
        /*
         * n<--1
         * c<--0
         * suma<--0
         * media<--0
         * 
         * visualizar "introduce n�meros y para su media introduce un 0"
         * while(n!=0)
         *  leer n
         *  suma<--suma+n
         *   if(n!=0)
         *    c<--c+1
         *   end if
         * end while
         * media<--suma/c
         * visualizar media
         * 
         * FIN
         */
        
        n=1;
        suma=0;
        media=0;
        c=0;      
        
        System.out.println("Introduce n�meros para realizar su media aritm�tica introduce un 0");
        
        while (n!=0){
          n=teclado.nextInt(); 
          suma=suma+n;
          if (n!=0){
        	  c++;
          }
        }  
      media=suma/c;
      System.out.println("La media aritm�tica es: "+media);
	}

}
