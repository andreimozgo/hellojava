package task4;

public class Point2 {

	public static void main(String[] args) {
		String str = "text example for exercisez"; //пример строки


		for (int i=0;i<str.length();i++){
			System.out.print(" "+str.charAt(i)+" ");
		}
		System.out.print("\n");
		for (int i=0;i<str.length();i++){
			System.out.printf("%3d",(int)str.charAt(i)-96);
		}
	}
}
