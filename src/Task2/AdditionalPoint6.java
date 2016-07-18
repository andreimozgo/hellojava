package Task2;
/*Напишите программу, которая выводит на экран значения функции 
 * у = 2х^2-5х-8 в диапазоне от -4 до 4. Шаг изменения аргумента 0,5.
 */
public class AdditionalPoint6 {

	public static void main(String[] args) {

		double x = -4;//начальный х
		double y;
		//считаем
		while (x<=4){
			y=2*Math.pow(x,2)-5*x-8;
			System.out.println("x="+x+"y="+y);
			x+=0.5;
		}
	}

}
