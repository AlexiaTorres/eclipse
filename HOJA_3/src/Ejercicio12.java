
public class Ejercicio12 {
	public static void main(String[] args) throws Throwable {
		int h,m,s;
		boolean hora;
		h=00;
		m=00;
		s=00;
		hora=true;
		String ampm="AM"; 
			
		while(hora){
			Thread.sleep(1000);
			s++;
			if(s>59){
				 m++;
				 s=00;
				}
			if(m>59){
				h++;
				m=00;
			}
			if (h>23){
				h=00;	
			}
			if (h>12){
				ampm="PM";
				}
			
			System.out.println(h+":"+m+":"+s+" "+ampm);

		}
		
		
		
		
		
	}

}
