package Task2;

public class AdditionalPoint1 {

	public static void main(String[] args) {
		int day = 2; //день
		int d = day;
		int month = 2;//мес€ц
		int m=0;//номер мес€ца по древнеримской системе
		int year = 2016;//год
		int c;//количество столетий
		int daynumber =0;//номер дн€ недели
		int y;//номер года в столетии

		//если мес€ц €нварь или февраль, то уменьшаем на единицу год и
		//присваиваем древнеримский номер мес€ца
		if (month<3){
			year--;
			m=month+10;
		}
		else{
			m=month-2;//присваиваем дневнеримкий номер мес€ца
		}

		c = year/100;//вычисл€ем количество столетий
		y=year%100;//вычисл€ем номер года в столетии
		daynumber=(d+(13*m-1)/5+y+(y/4)+(c/4)-(2*c)+777)%7;
		//выводим день недели
		switch (daynumber){
		case 1:
			System.out.println("ѕонедельник");
			break;
		case 2:
			System.out.println("¬торник");
			break;
		case 3:
			System.out.println("—реда");
			break;
		case 4:
			System.out.println("„етверг");
			break;
		case 5:
			System.out.println("ѕ€тница");
			break;
		case 6:
			System.out.println("—уббота");
			break;
		case 7:
			System.out.println("¬оскресение");
			break;
		}
	}

}
