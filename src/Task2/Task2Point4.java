package Task2;

public class Task2Point4 {

	public static void main(String[] args) {
	short year = 1900;
	//���� ��� ������ 400, �� �� ����������
	//��� ������ 4, �� �� ������ 100, �� �� ����������
	if ((year%400==0)||(year%4==0 && year%100!=0)) 
		System.out.println("��� ����������.");
	else //�� ���� ��������� ������� ��� �� ����������
		System.out.println("��� �� ����������.");
	}
}
