package classwork;

/*Создать программу, которая может приветствовать пользователя на трех языках: 
 * английском, русском, белорусском, а также выводит текущую дату с учётом 
 * текущей локали. Требуемый язык и страна должны сообщаться программе в 
 * качестве входных параметров. Если входные параметры отсутствуют, программа 
 * должна выдавать сообщение на английском*/

import java.text.Collator;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class I18nPoint2 {

	public static void main(String[] args) {
		Date currentDate = new Date();
		Locale loc = new Locale("en", "EN");
		Scanner scanner = new Scanner(System.in);
		String language;
		Collator collator = Collator.getInstance(loc);
		ResourceBundle rb = ResourceBundle.getBundle("resources/Text", loc);
		DateFormat dfEn = DateFormat.getDateInstance(DateFormat.FULL,
				Locale.getDefault());

		System.out.println("Choose language (en,ru,be): ");
		language = scanner.nextLine();
		if (collator.compare(language, "ru") == 0) {
			loc = new Locale("ru", "RU");
		}
		if (collator.compare(language, "be") == 0) {
			loc = new Locale("be", "BY");
		}
		if (collator.compare(language, "en") == 0) {
			loc = new Locale("en", "EN");
		}
		scanner.close();
		System.out.println(rb.getString("hello"));
		System.out.println(dfEn.format(currentDate));
	}
}
