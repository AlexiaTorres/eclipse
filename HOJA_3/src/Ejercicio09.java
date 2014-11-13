import java.util.Scanner;


public class Ejercicio09 {
	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);

//ENTORNO
/*
 * ini,fin  enteros introducidos por teclado, inicio y fin del intervalo
 * par,impar  contador de pares e impares, entero
 * sp,si  suma de pares e impares, entero
 */
int ini,fin,par,impar,sp,si;

//PROCESO
/*
 * leer ini
 * leer fin
 * par<--ini
 * sp<--0
 * impar<--ini
 * si<--0
 * 
 * while(par<=fin)
 * if(par%2==0)
 * sp<--sp+par
 * end if
 * par<--par+1
 * end while
 * visualizar sp
 * 
 * while(impar<=fin)
 * if(impar%2!=0)
 * si<--si+impar
 * end if
 * impar<--impar+1
 * end while
 * visualizar si
 */

System.out.println("ingresa numero de inicio");
ini=teclado.nextInt();
System.out.println("ingresa numero de fin");
fin=teclado.nextInt();


par=ini;
sp=0;
impar=ini;
si=0;
while(par<=fin){
if(par%2==0){
	sp=sp+par;
}
par++;
}System.out.printf("Suma de pares: %d",sp);


while(impar<=fin){
if(impar%2!=0){
	si=si+impar;
}
impar++;
}System.out.printf("\nSuma de impares: %d",si);

}

}