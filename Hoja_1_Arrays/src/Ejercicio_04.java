/*
 * 4. Almacenar en un vector de 10 posiciones los 10 números primos 
 * comprendidos entre 100 y 300. 
 * Luego mostrarlos en pantalla.
 */
public class Ejercicio_04 {
    public static void main(String[] args) {
		
		int n=10;
		int a[]=new int[n];
		
		int i=0;
		int num=100;
		boolean primo;
		
		while(i<a.length && num<300){
			primo=MetodosArrays.primo(num);
			if(primo){
				a[i]=num;
			System.out.println(i + "["+a[i]+"]");
				i++;
			}
			num++;
		}
	}
}
