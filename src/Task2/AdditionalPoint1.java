package Task2;

public class AdditionalPoint1 {

	public static void main(String[] args) {
		int day = 2; //����
		int d = day;
		int month = 2;//�����
		int m=0;//����� ������ �� ������������� �������
		int year = 2016;//���
		int c;//���������� ��������
		int daynumber =0;//����� ��� ������
		int y;//����� ���� � ��������

		//���� ����� ������ ��� �������, �� ��������� �� ������� ��� �
		//����������� ������������� ����� ������
		if (month<3){
			year--;
			m=month+10;
		}
		else{
			m=month-2;//����������� ������������ ����� ������
		}

		c = year/100;//��������� ���������� ��������
		y=year%100;//��������� ����� ���� � ��������
		daynumber=(d+(13*m-1)/5+y+(y/4)+(c/4)-(2*c)+777)%7;
		//������� ���� ������
		switch (daynumber){
		case 1:
			System.out.println("�����������");
			break;
		case 2:
			System.out.println("�������");
			break;
		case 3:
			System.out.println("�����");
			break;
		case 4:
			System.out.println("�������");
			break;
		case 5:
			System.out.println("�������");
			break;
		case 6:
			System.out.println("�������");
			break;
		case 7:
			System.out.println("�����������");
			break;
		}
	}

}
