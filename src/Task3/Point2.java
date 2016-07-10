package Task3;

public class Point2 {

	public static void main(String[] args) {
		//задаем массив и переменные. инициализируем их
		int [] myArray ={5,8,3,6,222,765,89,66,44,29};
		int max = myArray[0];
		int min = myArray[0];
		//перебираем массив и присваиваем переменным значение элемента массива 
		//в случае выполнения условия
		for(int i=1;i<myArray.length;i++){
			if (max<myArray[i])
				max=myArray[i];
			if (min>myArray[i])
				min=myArray[i];
		}
		//вывод результатов
		System.out.printf("min value = %3d%nmax value = %d%n", min,max);
	}

}
