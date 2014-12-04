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
	

//CUANTOS DIAS TIENE UN MES
public static String diasMes(int mes){
	int dias = 0;
	String m = null;
	
	switch(mes){
	case 1:
		m="Enero";
		dias=31;
		break;
	case 2:
		m="Febrero";
		dias=28;
		break;
	case 3:
		m="Marzo";
		dias=31;
		break;
	case 4:
		m="Abril";
		dias=30;
		break;
	case 5:
		m="Mayo";
		dias=31;
		break;
	case 6:
		m="Junio";
		dias=30;
		break;
	case 7:
		m="Julio";
		dias=31;
		break;
	case 8:
		m="Agosto";
		dias=30;
		break;
	case 9:
		m="Septiembre";
		dias=31;
		break;
	case 10:
		m="Octubre";
		dias=30;
		break;
	case 11:
		m="Noviembre";
		dias=31;
		break;
	case 12:
		m="Diciembre";
		dias=30;
	}
		
	return m + " tiene " + dias + " ";
}
	

//DIAS DE UN MES, SI EL MES ES BISIESTO

public static int mesBisiesto(int mes, int anyo){
	
	int dias;
	
	if(mes==1 || mes==3 || mes==5 || mes==7 || mes==9 || mes==11){
			dias=31;
		}else if(mes==2 && anyo%4==0 || anyo%400==0){
			dias=29;
		} else if (mes==2 && anyo%4!=0 || anyo%400!=0){
			dias=28;		
	} else {
		dias=30;
	}
	
return dias;	
	
	
	
	
}
	
	
//SABER UN DIA DE LA SEMANA

public static String Busca_Dia(int dia){
String El_Dia=null;
    
  switch(dia){
      case 0: El_Dia="Domingo"; break;
      case 1: El_Dia="Lunes"; break;
      case 2: El_Dia="Martes"; break;
      case 3: El_Dia="Miercoles"; break;
      case 4: El_Dia="Jueves"; break;
      case 5: El_Dia="Viernes"; break;
      case 6: El_Dia="Sabado"; break;    
  }

return El_Dia;
}
	
    public static int modulo_mes(int mes,int bisiesto){
    	int modulo=0;

    	switch(mes){
    	    case 1: modulo = 0; break;
    	    case 2: modulo = 3; break;
    	    case 3: if(bisiesto==1)
    	               modulo = 4;
    	            else 
    	              modulo = 3; break;
    	    case 4: if(bisiesto==1)
    	               modulo = 0;
    	            else 
    	              modulo = 6; break;
    	    case 5: if(bisiesto==1)
    	               modulo = 2;
    	            else 
    	              modulo = 1; break;
    	    case 6: if(bisiesto==1)
    	               modulo = 5;
    	            else 
    	              modulo = 4; break;
    	    case 7: if(bisiesto==1)
    	               modulo = 0;
    	            else 
    	              modulo = 6; break;
    	    case 8: if(bisiesto==1)
    	               modulo = 3;
    	            else 
    	              modulo = 2; break;
    	    case 9: if(bisiesto==1)
    	               modulo = 6;
    	            else 
    	              modulo = 5; break;
    	    case 10: if(bisiesto==1)
    	               modulo = 0;
    	            else 
    	              modulo = 1; break;
    	    case 11: if(bisiesto==1)
    	               modulo = 4;
    	            else 
    	              modulo = 3; break;
    	    case 12: if(bisiesto==1)
    	               modulo = 6;
    	            else 
    	              modulo = 5; break;        
    	}

    	return modulo;
    	

	
    }	
	
	
	
	
	
	
	
	
}
