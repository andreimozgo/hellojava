package task4;
/*Из небольшого текста удалить все символы, кроме пробелов, 
 * не являющиеся буквами.
 */
public class Point3 {

	public static void main(String[] args) {

		String str = "!,tex%t768 ex@ample98,.]"; //пример строки	
		//создаем переменную класса StringBuilder на основе str
		StringBuilder strNew = new StringBuilder(str);
		//перебираем все символы строки
		for(int i=0;i<strNew.length();i++){
			//если код символа не принадлежит заданному диапазону - удаляем
			if (((int)strNew.charAt(i)<97||(int)strNew.charAt(i)>122)&&(int)strNew.charAt(i)!=32){
				strNew.deleteCharAt(i);
				i--;//при удалении символа минусуем счетчик
			}
		}
		str=new String (strNew);
		System.out.println(str);
	}

}
