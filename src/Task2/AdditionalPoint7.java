package Task2;
import java.util.Scanner;
/**����� ������������ ����� �����������, ������� � �������� ������
 * ����������� ��� ����� � �������� - �������� ��� ���������.
 * ������� ��������� � ���������� ��������, ���� �� ����� ������ ������ q.
 * @author ������
 *
 */
public class AdditionalPoint7 {

	public static void main(String[] args) {

		String str="";
		double number1 = 1;//������ �����
		double number2 = 1;//������ �����
		double result; //��������� ��������
		Scanner input1 = new Scanner(System.in);//������ ������ Scanner ��� ���������� ������� �����
		Scanner input2 = new Scanner(System.in);//������ ������ Scanner ��� ���������� ������� �����
		Scanner input3 = new Scanner(System.in);//������ ������ Scanner ��� ���������� ��������

		while (!str.equals("q")){
			System.out.print("������� ������ �����:");
			number1=input1.nextDouble();
			System.out.print("������� ������ �����:");
			number2=input2.nextDouble();
			System.out.print("�������� �������� (+ ��� /):");
			str=input3.nextLine();

			if (str.equals("+")){
				result=number1+number2;
				System.out.println("��������� ��������:"+result);
			}
			if (str.equals("/")){
				result=number1/number2;
				System.out.println("��������� ��������:"+result);
			}
			System.out.print("������� q ��� ������ ��� ���� ��� �����������.");
			str=input3.nextLine();
		}
		input1.close();
		input2.close();
		input3.close();
	}

}
