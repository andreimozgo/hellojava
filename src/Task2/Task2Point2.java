package Task2;
import java.util.Scanner; //����������� ����� Scanner

public class Task2Point2 {

	public static void main(String[] args) {
		
	int number1, number2; //��� ����������, ������� ����� ������� � ����������
	Scanner input = new Scanner(System.in); //������� ������ ������ ������
	
	System.out.print("������� ������ �����: ");
	number1=input.nextInt(); //������ ������ �����
	System.out.print("������� ������ �����: ");
	number2=input.nextInt(); //������ ������ �����
	//���������� ����� � ������� ��������� ���������
	if (number1>number2)
		System.out.println("������ ����� ������.");
	if (number1<number2) 
		System.out.println("������ ����� ������.");
	if (number1==number2)
		System.out.println("����� �����");		
	}

}
