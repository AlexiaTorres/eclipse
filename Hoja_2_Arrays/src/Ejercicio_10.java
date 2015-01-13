
public class Ejercicio_10 {

	//incompleto
	
	public static void main(String[] args) {
		
		int a[][]=new int [3][3];
		int suma=0;
		int c=1;
		int aux=0;
		int media=0;

		
		Metodos.llenarArrayDosDimensiones(a, a.length);
		
	//MEDIA 	
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				
				suma=suma+a[i][j];
				
			}
			c++;
			aux=aux+c;
		}
		media=suma/aux;
		System.out.println(media);
		
	}

}
