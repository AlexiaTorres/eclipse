
public class TodosLosMetodos {

	//EJERCICIO 1
	
	public static boolean Primo(int n){
		
int c=0;
int d=1;

while(d<=n){
	if(n%d==0){
		c++;
	}
	d++;
}
if (c<=2){
	return true;
}else{
	return false;
}
	
	}

	//EJERCICIO 2
	public static void Factorial(int n){
		
		int c=1;
		int f=1;
		
		while(c<=n){
			f=f*c;
			c++;
		}
		System.out.println(f);
	
	}


	
	public static void Ejercicio03(int n, int x){
		
		int c=1;
		int c2=1;
		double f=1;
		double s=1;
		while(c2<=n){
		
			while(c<=c2){
			f=f*c;
			c++;
		}
			
			s=s+x/f;
			
		c2++;
		}
		System.out.println(s);
	}

	
	public static void Ejercicio04(double radiom, double radioM){
		
		double aream=Math.PI*Math.pow(radiom, 2);
		System.out.println("Area de la corona con radio:"+ radiom +" = "+ aream);

		double areaM=Math.PI*Math.pow(radioM, 2);
		System.out.println("Area de la corona con radio:"+ radioM + " = "+ areaM );
		
	}
	
	
	public static boolean Ejercicio05(int a, int b){
		
		boolean div;
		
		if(a%b==0){
			div=true;
		}else{
			div=false;
		}
		
         return div;		
		
	}
	
	
	public static void Ejercicio06(int i){
		
		int c=1;
		int m=0;
		
			while(c<=9){
			m=i*c;
			System.out.printf("%d x %d = %d \n",i,c,m );
			
			if(c>=9){
				System.out.println("\n");
			}
			c++;
		}
			
	}
	
	
	
	public static boolean DivisorComun(int a, int b, int c){
		
		boolean divisor = Ejercicio05(a, c);
		boolean divisor2 = Ejercicio05(b, c);
		
		if (divisor==true && divisor2==true){
			return true;
		}else{
			return false;
		}
		
		
	}

	//fibonacci primos
public static int ejercicio09(){ 
	
	int f1=1;
	int f2=1;

	while (true){

		f1=f2-f1;
		f2=f1+f2;
		
		System.out.println(f2);

	}

	}

//número perfecto
public static boolean ejercicio10(int n){
	int c=1;
	int d=1;
	int s=0;
	
	while(c<n && d!=n){
		if(n%d==0){
			s=s+d;
		}
		d++;
		c++;
		
	}
	if(s==n){
		return true;
	}else{
		return false;
	}
	
}

//todos los números perfectos

	public static void ejercicio11(int c2){
		
		int c=1;
		int d=1;
		int s=0;
		
		
		while (c<=Integer.MAX_VALUE && d!=c2){
			
			if(c2%d==0){
				s=s+d;
			}

			d++;
			c++;
		}
		if(s==c2){
			System.out.println(c2);
		}	
		}
		
	
//serie 
	/* PENSARLO CUANDO
	 * 
	 * ESTÉ
	 * EN
	 * CONDICIONES
	 */
	

//NÚMEROS AMIGOS
	
	public static boolean ejercicio13(int a, int b){
		
		int da=1;
		int db=1;
		int ca=1;
		int cb=1;
		int sa=0;
		int sb=0;
		
		while (ca<a){
			if(a%da==0){
				sa=sa+da;
			}
			da++;
			ca++;
		}
		
		while (cb<b){
			if(b%db==0){
				sb=sb+db;
			}
			db++;
			cb++;
		}
		
		if(sb==a && sa==b){
			return true;
		}else{
			return false;
		}
		
		
	}
	
	
//TODOS LOS NUMEROS AMIGOS DEL 1 AL 100	
	
	
	
	
	
	
//potencia
	
	public static int ejercicio15(int base, int exp){
		
		int potencia=base;
		int c=1;
		
		while(c<exp){
			potencia=potencia*base;
			c++;
		}
		return potencia;
	}
	
	
	
	
}


