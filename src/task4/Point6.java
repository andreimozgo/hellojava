package task4;
/*Для двух строк напишите метод, определяющий, является ли одна 
 * строка перестановкой другой.
 */
public class Point6 {

	public static void main(String[] args) {

		String str1 = "дирижабль"; //пример строки1
		String str2 = "ьирибажлд"; //пример строки2 
		char buf;
		StringBuffer strNew1 = new StringBuffer(str1);
		StringBuffer strNew2 = new StringBuffer(str2);		
//отсортируем символы в строке по возраставнию
		for (int i=0;i<strNew1.length();i++){
			for(int j=i+1;j<strNew1.length();j++){
				if ((int)strNew1.charAt(i)>(int)strNew1.charAt(j)){
					buf=strNew1.charAt(j);
					strNew1.deleteCharAt(j);
					strNew1.insert(j,strNew1.charAt(i));
					strNew1.deleteCharAt(i);
					strNew1.insert(i,buf);
				}
			}
		}
		//аналогично для второй строки
		for (int i=0;i<strNew2.length();i++){
			for(int j=i+1;j<strNew2.length();j++){
				if ((int)strNew2.charAt(i)>(int)strNew2.charAt(j)){
					buf=strNew2.charAt(j);
					strNew2.deleteCharAt(j);
					strNew2.insert(j,strNew2.charAt(i));
					strNew2.deleteCharAt(i);
					strNew2.insert(i,buf);
				}
			}
		}
		System.out.println(str1);
		System.out.println(str2);	
		str1=new String(strNew1);
		str2=new String(strNew2);
		
		//сравниваем две отсортированные строки
		if(str1.equals(str2)){
			System.out.println("Строки являются перестановкой друг друга");
		}
		else System.out.println("Строки не являются перестановкой друг друга");

	}

}
