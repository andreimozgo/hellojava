package Task3;
//Задача на подсчет количества отрицательных элементов в массиве
public class Point6 {

	public static void main(String[] args) {
		int [] myArray = {5,8,3,-6,222,765,-89,66,44,-29};
		int count=0;//Начальное значение счетчика 0
		//Перебираем массив и прибавляем к count 1, если элемент отрицательный
		for(int val:myArray){
			if(val<0)
				count++;
		}
		//Выводим результат
		System.out.println("Количество отрицательных элементов: "+count);
	}

}
