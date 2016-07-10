package task4;
import java.util.Scanner;
/* В каждом слове текста k-ю букву заменить заданным символом 
 * c клавиатуры. Если k больше длины слова, корректировку не выполнять.
 */

public class Point1 {

	public static void main(String[] args) {
		String str = " пример строки для задачи "; //пример строки
		Scanner input = new Scanner(System.in); //Scanner для ввода символов
		int k=4;//номер буквы в слове, которую мы будем менять на новый символ
		int n=0;//просто счетчик
		//массив символов, в который будет преобразована строка
		char [] strChar = str.toCharArray(); 
		//значение введенного символа будет тут
		char newLetter;

		//вводим символ с клавиатуры
		System.out.println("Введите символ: ");
		//переводим строку в массив
		newLetter=input.nextLine().charAt(0);
		//перебираем массив. если символ не равен пробелу, то плюсуем счетчик
		//бонус такого способа в игнорировании вероятного пробела перед первым словом
		for(int i=0;i<strChar.length-1;i++){
			if (strChar[i]!=' '){
				n++;
				//когда счетчик становится равен k заменяем символ
				if(n==k){
					strChar[i]=newLetter;
				}
			}
			else{
				//если символ равен пробелу, обнуляем счетчик
				n=0;
			}
		}
		//создаем строку из массива символов
		str=new String(strChar);
		//выводим ее на печать.
		System.out.println(str);
		//закрываем Scanner
		input.close();

	}
}


