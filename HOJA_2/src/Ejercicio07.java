
public class Ejercicio07 {
	public static void main(String[] args) {
		//ENTORNO
		/*
		 * h,m,s  enteros
		 */
		int h,m,s;
		//PROCESO
		/*
		 * h <--21
		 * m <--11
		 * s<--15
		 * 
		 * if (h>23)
		 * h<--0
		 * end if
		 * 
		 * if (m>59)
		 * h<--h+1
		 * m<--0
		 * end if
		 * 
		 * if(s>59)
		 * m<--m+1
		 * s<--0
		 * end if
		 * 
		 * visualizar "h:m:s"
		 * 
		 * FIN
		 */
		
		h=21; m=10; s=11;
		
		if (h>23){
			h=00;	
		}
		if(m>59){
			h++;
			m=00;
		}
		if(s>59){
		 m++;
		 s=00;
		}

		System.out.println(h+":"+m+":"+s);
	}

}
