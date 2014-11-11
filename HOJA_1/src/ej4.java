
public class ej4 {

	public static void main(String[] args) {
		
		//ENTORNO
		/*
		 * a,b,c,d enteros
		 * aux auxiliar entero
		 */
		int a,b,c,d;
		int aux;
		
		//PROCESO
		/*
		 * a <-- 1
		 * b <-- 2
		 * c <-- 3
		 * d <-- 4
		 * 
		 * visualizar "valores iniciales:"
		 * visualizar "a,b,c,d"
		 * 
		 * aux <-- b
		 * b <-- c
		 * c <--a
		 * a <-- d
		 * d <-- aux
		 * 
		 * visualizar "nuevos valores"
		 * visualizar a,b,c,d
		 * 
		 * FIN
		 */
		a=1;
		b=2;
		c=3;
		d=4;
		
		System.out.println("valores iniciales: ");
		System.out.println("a" +a + "b" + b + "c" + c + "d" + d);
		
		aux=b;
		b=c;
		c=a;
		a=d;
		d=aux;
		
		System.out.println("Nuevos valores: ");
		System.out.println("a" +a + "b" + b + "c" + c + "d" + d);
		

	}

}
