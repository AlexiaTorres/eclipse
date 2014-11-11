
public class Ejercicio30 {
	public static void main(String[] args) {
		//ENTORNO
		/*
		 *i  indice de recorrido
		 *divisores divisores encontrados,máximo 2
		 *n  número auxiliar
		 *e indice que va comparando con i para sacar los divisores 
		 */

		int i;
		int divisores;
		int n;
		int e;
		//PROCESO
		/*
          i=1;
		while(i<100)
			divisores<--0
			 n<--0
			 e<--1
			 i<--i+1
			while (e<=i)
				n<--e
			e<--e+1
			if ( i%e==0) 
				divisores++
			end if
            if (divisores==2) 
            break;
            end if
		  end while
            if (n==i && i!=1) 
            visualizar i 
            end if
         end while
		
 */
		
		
		i=1;
		while(i<100){
			divisores=0;
			n=0;
			e=1;
			i++;
			while (e<=i){
				n=e;
			e++;
			if ( i%e==0) {
				divisores++;
			}
            if (divisores==2)  {break;}
		}
            if (n==i && i!=1)  System.out.println (i);

		}
		
	//CON FOR
	
		/*for (int i=1; i<100; i++ ) {
	            int divisores = 0;
	            int n=0;
	            for (int e=1; e<=i; e++) { 
	            	n=e;
	                if ( (i % e)==0) divisores++;
	                if (divisores==2)  {break;}
	            }
	            if (n==i && i!=1)  System.out.println (i);
	        }*/
	        
	    }
	}