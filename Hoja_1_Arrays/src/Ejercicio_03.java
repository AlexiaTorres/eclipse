
public class Ejercicio_03 {

	public static void main(String[] args) {
		

		
		int a[]=new int [10];
		
		int num=0;
		int i=0;
		int j=1;
		
		a[i]=1;
		a[j]=1;
		while(num<a.length){
			a[i]=a[j]-a[i];
			a[j]=a[i]+a[j];	
			System.out.println("[" + a[j] + "]");
			num++;
		}

	}

}
