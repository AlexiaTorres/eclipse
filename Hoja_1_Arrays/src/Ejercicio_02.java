/*
 * 2. Leer 10 enteros, almacenarlos en un vector y determinar 
 * en qué posición del vector está el mayor número primo leído.
 */
public class Ejercicio_02 {
    public static void main(String[] args) {

		int n=5;
		int a[]=new int [n];
		boolean primo=false;
		int mayor;
		int posmayor;
		int i=0;
		
		MetodosArrays.llenarArray(a, n);
		MetodosArrays.visualizarArray(a, n);

	/*
	 * mi intención era:
	 * -buscar el mayor
	 * -su posicion
	 * -ver si es primo
	 * 
	 * si el mayor es primo: muestro su posicion; sino lo borro
	 * y de nuevo vuelvo a buscar el mayor, vuelvo a ver su posicion etc
	 * 	
	 */
		

		mayor=MetodosArrays.buscarMayor(a, n);
		posmayor=MetodosArrays.busquedaSecuencial(a, n, mayor);	
        primo=MetodosArrays.primo(mayor);
		
		if(primo){
			System.out.println(posmayor);
		} else {
				MetodosArrays.borrarElemento(a, n, mayor);
                }
		
}
}
