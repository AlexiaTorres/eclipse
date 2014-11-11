
public class Ejercicio27 {
	public static void main(String[] args) {
// ENTORNO
/*
 * n
 * f1
 * f2		
 */
int n,f1,f2;
//PROCESO
/*
 * n<--1
 * f1<--1
 * f2<--1
 * 
 * while(n<10)
 * n<--n+1
 * f2<--f1+f2
 * f1<--f2-f1
 * visualizar f2
 * end while
 * 
 * FIN
 */
	
n=1;
f1=1;
f2=1;
while(n<10){
	n++;
	f2=f1+f2;
    f1=f2-f1;
	System.out.println(f2 + "");
}
	}

}
