package Task3;
//Задача на вычисление суммы элементов массива до первого 0
public class Point7 {

	public static void main(String[] args) {
		int [] myArray = {5,8,3,-6,222,765,-89,0,44,-29};
		int sum=0;//сумма элементов
		//Перебираем массив и складываем его элементы, 
		//если элемент равен 0, цикл прерывается
		for(int val:myArray){
			sum+=val;
			if (val==0)
				break;
		}
		System.out.println("Сумма элементов до первого 0 = "+sum);

	}

}
