
public class Ejercicio22 {
	public static void main(String[] args) {
		//ENTORNO
		/*
		 * n  entero del 0 al 9
		 */
		int n;
		
		//PROCESO
		/*
		 * n<--0
		 * visualizar n*3
		 * while (n>=0 && n<9)
		 *  n<--n+1
		 *  visualizar n*3
		 * end while
		 * 
		 * FIN
		 */
		
		n=0;
		System.out.println("3x" +n + "= " + n*3);

		while (n>=0 && n<9){
			n++;
			System.out.println("3x" +n + "= " + n*3);
		}

	}

}
