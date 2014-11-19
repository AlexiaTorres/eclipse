import java.util.Scanner;


public class PruebaMetodos {

	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);
System.out.println("Introduce el número del ejercicio: ");

int opc=teclado.nextInt();
	
switch (opc) {
case 1:  //INCOMPLETO, LAPSUS, NO SÉ HACERLO
	
	int n;
	int i=1;

	System.out.println("introduce un número para ver los numeros primos que hay hasta éste:");

	n=teclado.nextInt();
	
	while(i<=n){
		boolean primo=TodosLosMetodos.Primo(n);

		if (primo){
		
		System.out.println(i);
		
		}i++;
	}

	break;

case 2:
	
	System.out.println("Introduce número para ver su factorial");
	n=teclado.nextInt();
	TodosLosMetodos.Factorial(n);
	
case 3:
	n=teclado.nextInt();
	int x=1;
TodosLosMetodos.Ejercicio03(n, x);
	
case 4:
	double radiom;
	double radioM;
	
	System.out.println("Introduce dos medidas de radio de una corona para ver su área, uno más pequeño que el otro:");
	
	radiom=teclado.nextDouble();
	radioM=teclado.nextDouble();
	
	TodosLosMetodos.Ejercicio04(radiom, radioM);
	
case 5:
	
	int a;
	int b;
	
	System.out.println("Introduce dos números, para ver si el segundo es divisor del primero");
	
	a=teclado.nextInt();
	b=teclado.nextInt();
	
	boolean div=TodosLosMetodos.Ejercicio05(a, b);
	System.out.println(div);
	
case 6:

	i=1;
	while(i<=10){
TodosLosMetodos.Ejercicio06(i);
i++;
	}
	
case 7: 
	
	//int a,b,c
	
	boolean divisor;
	
	System.out.println("Introduce tres números, a,b,c, para ver si c es divisor de a y b");
	a=teclado.nextInt();
	b=teclado.nextInt();
	int c=teclado.nextInt();
	
	divisor=TodosLosMetodos.DivisorComun(a, b, c);
	
	System.out.println(divisor);
	
	

}
	}

}
