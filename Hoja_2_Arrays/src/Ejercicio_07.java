
public class Ejercicio_07 {

	public static void main(String[] args) {

		int a[][]=new int[3][2];
		int k=1;
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				a[i][j]=k;
				System.out.println(a[i][j]);
				
				k++;
			}
			System.out.println();
		}
		
	}

}
