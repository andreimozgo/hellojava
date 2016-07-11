package task4;
/*5. Реализуйте алгоритм, определяющий, все ли символы в строке 
 * встречаются один раз.
 */
public class Point5 {

	public static void main(String[] args) {
		String str = "qwertyuiopasdfghjklzxcvbnm "; //пример строки
		int n=0;//счетчик
		/*перебираем строку
		 * если повторяющихся символов не было (n=0), то берем очередной символ
		 * и ищем такой же до конца строки. Если находим - плюсуем счетчик и 
		 * выходим из цикла
		 */
		for(int i=0;i<str.length();i++){
			if(n==0){
				for (int j=i+1;j<str.length();j++){
					if(str.charAt(i)==str.charAt(j)){
						n++;
						break;
					}
				}
			}
			else break;
		}
		//если счетчик равен 0 - символы не повторялись
		if(n==0){
			System.out.println("Все символы в строке встречаются один раз");
		}
		else {
			System.out.println("Некоторые символы встречаютcя чаще одного раза");
		}
	}
}
