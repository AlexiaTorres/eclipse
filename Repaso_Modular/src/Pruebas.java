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
	
case 12:
	System.out.println("serie: s=1/1! + 2² + 3³/3! + 5⁵/5! + 7⁷/7!...");
	String s="";
	n=5;
	c=1;
	cp=0;
	x=1;
	boolean px;
	//boolean p;
	
	while(cp<n){
		p=TodosLosMetodos.primo(c);
		px=TodosLosMetodos.primo(x);
		fact=TodosLosMetodos.factorial(x);
		if(p && px){
			cp++;
			s=s + " " + Math.pow(c, c)+ " / " + fact + " + " ;
		}
		c++;
		x++;
	}
 System.out.println(s);

 break;
 
case 13:
	System.out.println("Escribe una función “DiasMes”, a la que le pasamos un mes (en formato numérico 1=Enero, 2=Febrero, etc, y nos dice el número de días que tiene ese mes.");
 
	System.out.println("Ingresa mes: ");
	int mes=teclado.nextInt();
 
	String dias=TodosLosMetodos.diasMes(mes);
	System.out.println(dias + "dias");

 break;
 
case 14:
	System.out.println("Escribe la función “DiasMes2” a la que le pasas un mes y un año y te dice cuántos días tiene ese mes, teniendo en cuenta si el año es bisiesto o no");
 
	System.out.println("Introduce mes: ");
	mes=teclado.nextInt();
	System.out.println("Introduce año: ");
	int anyo=teclado.nextInt();
 
 int dm=TodosLosMetodos.mesBisiesto(mes, anyo);
 System.out.println("Tiene "  + dm + " dias");
 
 break;
 
case 15:
	
	int año;
	int diia;
	
	int comprobar_año;

	System.out.println("ingresa año");
	 año = teclado.nextInt();

	System.out.println("ingresa mes: del 1 al 12");
	 mes = teclado.nextInt();

	System.out.println("ingresa dia");
	 diia = teclado.nextInt();

	do{
	System.out.println("El año es bisiesto? Si->1,  No->2");
	 comprobar_año = teclado.nextInt();
	}while(comprobar_año>2 || comprobar_año==0);

	int modulo_mes = TodosLosMetodos.modulo_mes(mes,comprobar_año);

	//Formula para saber el dia 
	int A = (año-1) % 7;
	int D = diia % 7;
	int DM = (((año-1)/4) - (3*((año-1)/100+1)/4)) % 7;
	int resultado = (A + D + modulo_mes + DM) % 7;

	    String busca_dia = TodosLosMetodos.Busca_Dia(resultado);
	    System.out.println("El dia Es: " + busca_dia);
	    
	    break;
	 case 16:  
		 
		 int nDia;
		 int nMes;
		 int dDia = 0;
		 
		 System.out.println("Introducir dia: ");
         nDia=teclado.nextInt();
		 System.out.println("Introducir mes (número del 1 al 12): ");
		 nMes=teclado.nextInt();	 
		 
		 
			switch(nMes){
			case 1:
				dDia=nDia;
				break;
			case 2:
				dDia=nDia+31;
				break;
			case 3:
				dDia=nDia+59;
				break;
			case 4:
				dDia=nDia+90;
				break;	
			case 5:
				dDia=nDia+120;
				break;
			case 6:
				dDia=nDia+151;
				break;	
			case 7:
				dDia=nDia+181;
				break;	
			case 8:
				dDia=nDia+212;
				break;	
			case 9:
				dDia=nDia+243;
				break;	
			case 10:
				dDia=nDia+273;
				break;
			case 11:
				dDia=nDia+304;
				break;	
			case 12:
				dDia=nDia+334;
				break;		
			}
		
			System.out.printf("El %d º dia del año es el %d de %d",dDia,nDia,nMes);

	 case 17:
		 
		 String dia[]={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		int numDia;
		
		 
 
}
}

}
