package task5;
import java.util.Calendar;
/*Train: Пункт назначения, Номер поезда, Время отправления, Число мест
(общих, купе, плацкарт, люкс).*/
public class MainProgram {


	public static void main(String[] args) {

		Train [] timetable = new Train[5];//расписание поездов
		String goalDestination ="Минск";//заданный пункт назначения
		int goalSeats=1;//необходимое количество общих мест
		//инициализируем переменные типа Calendar
		Calendar time = Calendar.getInstance();
		Calendar time0= Calendar.getInstance();
		Calendar time1= Calendar.getInstance();
		Calendar time2= Calendar.getInstance();
		Calendar time3= Calendar.getInstance();
		Calendar time4= Calendar.getInstance();


		time.set(2016, 7, 15, 12, 30);//заданное время при поиске
		//время отправления поездов
		time0.set(2016, 7, 15, 11, 20);
		time1.set(2016, 7, 15, 7, 30);
		time2.set(2016, 7, 15, 13, 00);
		time3.set(2016, 7, 15, 16, 35);
		time4.set(2016, 7, 15, 18, 35);

		//создаем расписание: пункт назначения, номер поезда, время 
		//отправления, количество общих мест
		timetable[0]=new Train("Минск",1,time0,20);
		timetable[1]=new Train("Гродно",2,time1,0);
		timetable[2]=new Train("Минск",3,time2,11);
		timetable[3]=new Train("Минск",4,time3,0);
		timetable[4]=new Train("Минск",5,time4,6);

		//список поездов, следующих до заданного пункта назначения
		for (int i=0;i<timetable.length;i++){
			timetable[i].Search(goalDestination);
		}
		//список поездов, следующих до заданного пункта назначения и 
		//отправляющихся после заданного часа;
		for (int i=0;i<timetable.length;i++){
			timetable[i].Search(goalDestination,time);
		}
		//список поездов, следующих до заданного пункта назначения и 
		//отправляющихся после заданного часа;
		for (int i=0;i<timetable.length;i++){
			timetable[i].Search(goalDestination,goalSeats);
		}
		//проверка сеттера
		timetable[0].SetDestination("Жлобин");
		System.out.println(timetable[0].GetDestination());
		//проверка переопределенного метода toString()
		System.out.println(timetable[0].toString());

	}

}


