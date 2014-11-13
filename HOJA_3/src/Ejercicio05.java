import java.util.Scanner;


public class Ejercicio05 {

	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);

//ENTORNO
/*
 * n entero leído por teclado
 * i,j contadores
 * d divisores
 */
int n,i,j,d;

//PROCESO
/*
 * leer n
 * i<--1
 * j<--2
 * 
 * while(i<n)
 * i<--i+1
 *  if(n%i==0)
 *  d<--0
 *  j<--1
 *   while(j<=i)
 *    if(i%j==0)
 *    d<--d+1
 *    end if
 *   j<--j+1
 *   end while 
 *   if(d<=2)
 *   visualizar i
 *   end if
 *  end if
 * end while
 * 
 *   FIN
 */

i=1; j=2;
n=teclado.nextInt();
while(i<n){
	i++;
	if(n%i==0){
		d=0;
		j=1;
		while(j<=i){
			if(i%j==0){
				d++;
			}
			j++;
		}
		if(d<=2){
			System.out.println(i);
		}
	}
	
}
}

}
