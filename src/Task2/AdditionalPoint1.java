package Task2;

public class AdditionalPoint1 {

	public static void main(String[] args) {
		int day = 2; //день
		int d = day;
		int month = 2;//месяц
		int m=0;//номер месяца по древнеримской системе
		int year = 2016;//год
		int c;//количество столетий
		int daynumber =0;//номер дня недели
		int y;//номер года в столетии

		//если месяц январь или февраль, то уменьшаем на единицу год и
		//присваиваем древнеримский номер месяца
		if (month<3){
			year--;
			m=month+10;
		}
		else{
			m=month-2;//присваиваем дневнеримкий номер месяца
		}

		c = year/100;//вычисляем количество столетий
		y=year%100;//вычисляем номер года в столетии
		daynumber=(d+(13*m-1)/5+y+(y/4)+(c/4)-(2*c)+777)%7;
		//выводим день недели
		switch (daynumber){
		case 1:
			System.out.println("Понедельник");
			break;
		case 2:
			System.out.println("Вторник");
			break;
		case 3:
			System.out.println("Среда");
			break;
		case 4:
			System.out.println("Четверг");
			break;
		case 5:
			System.out.println("Пятница");
			break;
		case 6:
			System.out.println("Суббота");
			break;
		case 7:
			System.out.println("Воскресение");
			break;
		}
	}

}
