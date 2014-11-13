


public class Ejercicio03 {
	public static void main(String[] args) {
		int x,y;
		int dx,dy;
		int sx,sy;
		
		x=0;y=0;dx=0;dy=1;sx=0;sy=1;
		while(x<10){
			x++;
			while(dx<x){
				dx++;
				if(x%dx==0){
					sx=sx+dx;
					System.out.println(sx);
				}
			}
		}
		
}}
