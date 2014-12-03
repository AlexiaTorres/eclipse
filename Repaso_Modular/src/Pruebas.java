import java.util.Scanner;


public class Pruebas {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Elige numnero de ejercicio");	
		int opc=teclado.nextInt();	
		
switch(opc){
case 1:
	System.out.println("Ver los n primeros numeros primos");
int n=teclado.nextInt();
int cp=0;
int c=1;
boolean primo;

while(cp<n){
	primo=TodosLosMetodos.primo(c);
	if(primo){
		cp++;
		System.out.println(c);
	}
	c++;
}
break;
case 2:
	System.out.println("Números primos hasta el número n");
System.out.println("Introduce n");
n=teclado.nextInt();
c=1;

while(c<=n){
	primo=TodosLosMetodos.primo(c);
	if(primo){
		System.out.println(c);
	}
	c++;	
}

case 3:
	System.out.println("Ver los n primeros fibonacci");
System.out.println("");
System.out.println("Introduce n:");
n=teclado.nextInt();
int fibo=TodosLosMetodos.fibonacci(n);
System.out.println(fibo);

//qué tengo que poner en return para hacerlo asi
//sino poner void y aqui solo mostrar y ya

case 4:
	System.out.println("Pasar un número de decimal a binario:");
    System.out.println("Introduce el número a convertir:");
	n=teclado.nextInt();
	String binario=TodosLosMetodos.binario(n);
	System.out.println(n + "=" + binario);
	
case 5:
	long isbn=844151358;
	long cpais;
	long ced;
	long resto;
	long numart;
	
	cpais=isbn/10000000;
	resto=isbn%10000000;
	ced=resto/10000;
	resto=resto%10000;
	numart=resto;
	
	System.out.println("Código de país: "+cpais);
	System.out.println("Código del editor: "+ced);
	System.out.println("Número de articulo: "+numart);
	
	long r;
	long sd=0;
	long dg=0;
	long cc=9;
	char x='x';
	
	while(isbn>9){
		r=isbn%10;
		dg=r*cc;
		sd=sd+dg;
		isbn=isbn/10;
		cc--;
	}
	sd=sd+isbn;
	
	dg=dg%11;
	if(dg<=9){
		dg=dg;
	}else{
		dg=x;
	}
	
	System.out.println("Dígito de control: "+dg);
	break;
case 6: 
	System.out.println("Primos de 1 a n");
n=teclado.nextInt();
c=1;
boolean p;

while(c<=n){
p=TodosLosMetodos.primo(c);
if(p){
	System.out.println(c);
}
c++;
}
	
break;
case 7: 
	System.out.println("n primeros numeros primos");
n=teclado.nextInt();
c=1;
cp=0;
//boolean p;

while(cp<n){
	p=TodosLosMetodos.primo(c);
	if(p){
		cp++;
		System.out.println(c);
	}
	c++;
}
	
break;
case 8:
	System.out.println("Primos de z numero a y numero");
System.out.println("");	
System.out.println("introduce z:");
int z=teclado.nextInt();
System.out.println("introduce y:");
int y=teclado.nextInt();
//boolean p;

while(z<=y){
	p=TodosLosMetodos.primo(z);
	if(p){
		System.out.println(z);
	}
	z++;
}
break;

case 9:
	System.out.println("pares de 1 a n");

n=teclado.nextInt();
c=1;
boolean par;

while(c<=n){
	par=TodosLosMetodos.par(c);
	if(par){
		System.out.println(c);
	}
	c++;
}
break;

case 10:
	System.out.println("n primeros pares");
	
n=teclado.nextInt();
c=1;
cp=0;
//boolean par;

while(cp<n){
	par=TodosLosMetodos.par(c);
	if(par){
		System.out.println(c);
		cp++;
	}
	c++;
}
break;

case 11:
	System.out.println("Factorial de los numeros de 1 a n");

n=teclado.nextInt();
c=1;
int fact;

while(c<=n){
	fact=TodosLosMetodos.factorial(c);
System.out.println(fact);
c++;
}
break;	
	


}
}

}
