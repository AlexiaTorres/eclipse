import java.util.Scanner;


public class Ejercicio02 {
	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);

//ENTORNO
/*
 * x,y  enteros introducidos por teclado
 * d,dy divisores de x e y, enteros
 * s,sy suma de divisores x e y, enteros
 */

		int x,y;
		int d,dy;
		int s,sy;
//PROCESO
/*
 * leer x
 * leer y
 * d<--0
 * dy<--0
 * s<--0
 * sy<--0
 * 
 * while(d<x)
 * d<--d+1
 * if(x%d==0)
 *  s<--s+d
 * end if
 * end while
 * visualizar "suma divisores de x: s"
 * 
 * while(dy<y) 
 * dy<--dy+1
 * if(y%dy==0)
 *  sy<--sy+dy
 * end if
 * end while
 * visualizar "suma divisores de y: sy"
 * 
 * if(s==y && sy==x)
 * visualizar "x e y son amigos"
 * else
 * visualizar "no son amigos"
 * end if
 * 
 * FIN
 */
		

		System.out.println("Introduce el primer número");
		x=teclado.nextInt();
		System.out.println("Introduce el segundo número");
		y=teclado.nextInt();
		sy=0;
		s=0;
		d=0;
		dy=0;
	while(d<x){
		d++;
		if(x%d==0){
		s=s+d;
		}
		}System.out.println("Suma de los divisores de "+x+": "+s);
	
		while(dy<y){
			dy++;
			if(y%dy==0){
			sy=sy+dy;
			}
			}System.out.println("Suma de los divisores de "+y+": "+sy);
	
			if(s==y && sy==x){
				System.out.printf("Los números %d e %d son amigos",x,y);
			}else{
				System.out.printf("Los números %d e %d no son amigos",x,y);

			}
	}

}
