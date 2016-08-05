package task16;

/*Написать  программу,  выполняющую  поиск  в  строке  всех  тегов  
 * абзацев,  в  т.ч.  тех,  у  которых  есть  параметры,  например  
 * <p  id=”p1”>,  и замену их на простые теги абзацев <p> (атрибуты 
 * игнорируем).*/

public class task16Point4 {

	public static void main(String[] args) {
		String str = "gjgvh<p  id=”p1”>vkhgfjgfjhgvk<p  id=”p1”>jhgj kgk<p>hj gkhjg  khg kjhgkjhgkj ";
		String strModified;

		strModified = str.replaceAll("<p.+?>", "<p>");
		System.out.println(strModified);
	}
}
