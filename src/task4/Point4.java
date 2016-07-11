package task4;
/*4. Из текста удалить все слова заданной длины, начинающиеся на согласную букву.
 * 
 */
public class Point4 {

	public static void main(String[] args) {
		String str = " прим строки для день озон задачи "; //пример строки

		StringBuilder strNew = new StringBuilder(str); //создаем стрингбилдер
		int n=0;//счетчик, из =0 начинает увеличиваться только, если первая буква в слове согласная
		//если счетчик больше 0, то увеличивается при любую букву или цифру.
		//обнуляется, если находит не букву и не цифру
		int l=4;//заданная длина слова
		//массив согласных букв
		char [] array = {'б','в','г','д','ж','з','й','к','л','м','н','п','р','с','т','ф','х','ц','ч','щ','ш','Б','В','Г','Д','Ж','З','К','Л','М','Н','П','Р','С','Т','Ф','Х','Ц','Ч','Ш','Щ'}; 

		System.out.println(str);//выводим исходную строку для контроля
		//перебираем строку
		for(int i=0;i<strNew.length();i++){

			//если символ буква или цифра (мало ли какие слова, может и с цифрами :))
			//и счетчик >0 (т.е. слово началось с согласной), то увеличивается
			if (Character.isLetterOrDigit(strNew.charAt(i))&&n>0){
				n++;
			}
			//если символ буква или цифра и счетчик =0, то проверяет согласная ли
			//если согласная, счетчик увеличивается
			if(Character.isLetterOrDigit(strNew.charAt(i))&&n==0){
				for(int j=0;j<array.length;j++){
					if(strNew.charAt(i)==array[j]){
						n++;
					}
				}
			}
			//если попалась не буква и не цифра, то проверяем равна ли длина 
			//слова (т.е. счетчик n) заданной длине l
			//если равна - удаляем слово
			if (!Character.isLetterOrDigit(strNew.charAt(i))){
				if(n==l){
					strNew.delete(i-l, i);
					n=0;i-=l;
				}
				else n=0;
			}
		}
		//выводим результат
		System.out.println(strNew);

	}

}
