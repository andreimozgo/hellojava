package Task2;
import java.util.Scanner; 
public class AdditionalPoint3 {

	public static void main(String[] args) {

		int number=0;
		int factorial=1;//�������, �.�. ��������� 0=1
		Scanner input = new Scanner(System.in);//������� ������ ������ Scanner ��� ����� � ����������

		System.out.println("������� ����������� �����:");
		number=input.nextInt();//������ �����

		for (int i=1;i<number+1;i++){
			factorial*=i;//������� ���������
		}
		//���� ���� ������� ������������� ����� - �������� �� ������
		if (number>=0)
			System.out.println("��������� ����� �����="+factorial);
		else
			System.out.println("�� ����� �������� �����.");	

	}

}
