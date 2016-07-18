package task5;

import java.util.Calendar;

public class Train {

	private String destination = new String();
	private String str = new String();
	private int number;
	private Calendar time = Calendar.getInstance();
	private int seatGeneral;
	private int seatCoupe=2;
	private int seatPlac=10;
	private int seatLux=5;


	public Train(){
	}
	//несколько вариантов конструкторов
	public Train(int number) {
		this.number = number;
	}

	public Train(String destination, int number, Calendar time, int seatGeneral, int seatCoupe, int seatPlac, int seatLux) {

		this.destination = destination;
		this.number = number;
		this.time = time;
		this.seatGeneral = seatGeneral;
		this.seatCoupe = seatCoupe;
		this.seatLux = seatLux;

	}

	public Train(String destination, int number, Calendar time, int seatGeneral) {

		this.destination = destination;
		this.number = number;
		this.time = time;
		this.seatGeneral = seatGeneral;

	}
	//метод для поиска поезда следующего до заданного пункта назначения
	public void Search (String destination){
		if (this.destination == destination){
			System.out.println("До заданного пункта следует поезд номер "+number);
		}
		return ;
	}
	//метод для поиска поезда следующего до заданного пункта назначения и
	//отправляющегося после заданного времени
	public void Search (String destination, Calendar time){
		if((this.destination == destination) &&(this.time.after(time))){
			System.out.println("До заданного пункта и после указанного времени следует поезд номер "+number);
		}
	}
	//метод для поиска поезда следующего до заданного пункта назначения и
	//имеющего общие места
	public void Search(String destination, int seatGeneral){
		if((this.destination == destination)&&(this.seatGeneral>seatGeneral)){
			System.out.println("До заданного пункта с общими местами следует поезд номер "+number);
		}
	}
	
	//сеттеры и геттеры для всех свойств класса Train
	public void SetDestination(String destination){

		this.destination = destination;

	}

	public String GetDestination(){

		return destination;
	}

	public void SetNumber(int number){

		this.number = number;

	}

	public int GetNumber(){

		return number;
	}
	
	public void SetTime(Calendar time){

		this.time = time;

	}

	public Calendar GetTime(){

		return time;
	}	
	
	public void SetSeatGeneral(int seatGeneral){

		this.seatGeneral = seatGeneral;

	}

	public int GetSeatGeneral(){

		return seatGeneral;
	}
	
	public void SetSeatCoupe(int seatCoupe){

		this.seatCoupe = seatCoupe;

	}

	public int GetSeatCoupe(){

		return seatCoupe;
	}
	
	public void SetSeatPlac(int seatPlac){

		this.seatPlac = seatPlac;

	}

	public int GetSeatPlac(){

		return seatPlac;
	}

	public void SetSeatLux(int seatLux){

		this.seatLux = seatLux;

	}

	public int GeatLux(){

		return seatLux;
	}
	//переопределение метода toString()
	@Override
	public String toString(){
		return "Назначение: "+destination+" Номер: "+number+" Отправление: "
				+time.get(Calendar.HOUR)+":"+time.get(Calendar.MINUTE)
				+ " Общих мест: "+seatGeneral+"\nМест купе: "
				+seatCoupe+" Мест плацкарт: "+seatPlac+" Мест люкс: "+seatLux;
	}
}

