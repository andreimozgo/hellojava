package Task2;

public class AdditionalPoint6 {

	public static void main(String[] args) {

		double x = -4;
		double y;
		
		while (x<=4){
		y=2*Math.pow(x,2)-5*x-8;
		System.out.println("x="+x+"y="+y);
		x+=0.5;
		}
	}

}
