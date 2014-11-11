
public class Ejercicio16 {
	public static void main(String[] args) {
		
		//ENTORNO
		/*
		 * n  entero de 0 a 100
		 */
		int n;
		
		//PROCESO
		/*
		 * n<--0
		 * while (n>=0 && n<100)
		 *  n<--n+1
		 *   if(n%2==0)
		 *   visualizar n
		 *   end if
		 *  end while
		 *  
		 *  FIN
		 */
		n=0;
		while(n>=0 && n<100){
			n++;
			if (n%2==0){
				System.out.println(n);
			}
		}
	}

}
