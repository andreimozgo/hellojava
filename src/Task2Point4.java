
public class Task2Point4 {

	public static void main(String[] args) {
	short year = 1900;
	//если год кратен 400, то он високосный
	//или кратен 4, но не кратен 100, то он високосный
	if ((year%400==0)||(year%4==0 && year%100!=0)) 
		System.out.println("Год високосный.");
	else //во всех остальных случаях год не високосный
		System.out.println("Год не високосный.");
	}
}
