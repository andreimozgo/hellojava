package Task2;

public class Task2Point1 {
	public static void main(String[] args) {
		String str = "строка с любым текстом";	
		String strPart1 = ""; //первая часть строки
		String strPart2 = "";  //вторая часть строки

		//выводим количество символов в строке
		System.out.println("Количество символов в строке: "+ str.length());
		//делим исходную строку на две
		strPart1=str.substring(0,str.length()/2);
		strPart2=str.substring(str.length()/2);
		//выводим две новые строки
		System.out.println("Первая часть строки: "+strPart1+ "\n" +"Вторая часть строки: "+strPart2);
	}
}
