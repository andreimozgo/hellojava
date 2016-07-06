package Task3;

public class Point8 {

	public static void main(String[] args) {
		int [] myArray = {5,8,3,-6,222,0,-89,66,44,-29};
		int proizv;

		if (myArray[0]==0)
			System.out.println("Ноль является первым элементом. Вычисление невозможно.");
		else{
			proizv=myArray[0];
			for(int i=1;i<myArray.length;i++){
				if (myArray[i]!=0)
					proizv*=myArray[i];
				else
					break;
			}
			System.out.println("Произведение элементов массива до первого 0 = "+proizv);
		}
	}
}
