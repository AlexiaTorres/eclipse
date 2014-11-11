
public class ej3 {
	public static void main(String[] args) {
		
		//ENTORNO
		/*
		 * n es un entero
		 */
		int n = 2;
		int aux;
		//PROCESO
		/*
		 * n <-- 2
		 * aux <-- n
		 * n <-- n+77
		 * n<-- aux
		 * n <-- n-3
		 * n <-- aux
		 * n <-- n*2
		 * n <-- aux
		 * FIN
		 */
		
		aux=n;
		n=n+77;
		System.out.println(n);
		n=aux;
		System.out.println(n);
		n=n-3;
		System.out.println(n);
		n=aux;
		System.out.println(n);
		n=n*2;
		System.out.println(n);
		n=aux;
		System.out.println(n);

		
	}

}
