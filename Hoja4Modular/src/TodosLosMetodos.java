
public class TodosLosMetodos {

	//EJERCICIO 1
	
	public static boolean Primo(int n){
		
		int c=2;
		boolean primo=true;
		
		while(c<=n){

			if(n%c==0){
				primo=false;
				c++;
			}
	
		}
		

return primo;	
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}