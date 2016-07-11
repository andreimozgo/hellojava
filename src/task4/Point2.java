package task4;
/*В английском тексте каждую букву заменить ее порядковым номером 
 * в алфавите. При выводе в одной строке печатать текст с двумя 
 * пробелами между буквами, в следующей строке внизу под каждой 
 * буквой печатать ее номер.
 */

public class Point2 {

	public static void main(String[] args) {
		String str = "text, example for - exercisez!"; //пример строки
		//создаем две переменных класса StringBuilder
		StringBuilder strNew1 = new StringBuilder(str);//1я на основе строки str
		StringBuilder strNew2 = new StringBuilder();//2я будет второй выводимой строкой

		//перебираем все символы строки strNew1
		for(int i=0;i<strNew1.length()-1;i++){
			//если подряд идут две буквы - разделяем их двумя пробелами
			if (Character.isLetter(strNew1.charAt(i))&&Character.isLetter(strNew1.charAt(i+1))){
				strNew1.insert(i+1,"  ");
				i++;
			}
		}
		//формируем вторую строку
		for (int i=0;i<strNew1.length();i++){
			//если в строке strNew1 идет буква, то в strNew2 вставляем ее номер в алфавите
			if(Character.isLetter(strNew1.charAt(i))){
				//проверка номера буквы. если меньше 10, то после номера копируем два пробела
				if(((int)(strNew1.charAt(i))-96)<10){ 
					strNew2=strNew2.append((int)strNew1.charAt(i)-96);					
				}
				else {
					//если номер буквы больше 9, то копируем один пробел
					strNew2=strNew2.append((int)strNew1.charAt(i)-96);
					i++;
				}
			}
			else{
				//если в строке strNew1 не буква, то вставляем пробел
				strNew2=strNew2.append(' ');
			}
		}
		//выводим строки
		System.out.println(strNew1);
		System.out.println(strNew2);
	}
}
