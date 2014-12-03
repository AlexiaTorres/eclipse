public class TodosLosMetodos {

//SI UN NUMERO ES PRIMO O NO

public static boolean primo(int n){
	int c=0;
	int d=1;
	
	while(d<=n){
		if(n%d==0){
			c++;
		}
		d++;
	}
	
	if(c<=2){
		return true;
	}else{
		return false;
	}	
}
	
	
//N PRIMEROS FIBONACCI
public static int fibonacci(int n){
	
int f1=1;
int f2=1;
int c=1;

	while(c<=n){
		f1=f2-f1;
		f2=f1+f2;
		System.out.println(f2);
		c++;
	}
	return n;
}


//PASAR UN NÚMERO DE DECIMAL A BINARIO
public static String binario(int n){
	String binario="";
	String digito="";
	int d=n;
	
	while(d>0){
		if(d%2==1){
			digito="1";
		}else{
			digito="0";
		}
	binario=digito+binario;	
	d=d/2;
	}
	return binario;	
}
	

//VER SI UN NUMERO ES PAR O IMPAR

public static boolean par(int n){
	
	if(n%2==0){
		return true;
	}else{
		return false;
	}
	
}
	
//FACTORIAL

public static int factorial(int n){
	int f=1;
	int c=1;
	
	while(c<=n){
		f=f*c;
		c++;
	}
	return f;
}


//SEPARAR CIFRAS DE DERECHA A IZQUIERDA con void

public static void separarCifras(int n){
	int r=0;
	
	while(n>9){
		r=n%10;
		System.out.println(r);
		n=n/10;
	}
	System.out.println(n);
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
