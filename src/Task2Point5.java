
public class Task2Point5 {

	public static void main(String[] args) {
		double weight = 82; //��� ������������
		double height = 181; //���� ������������
		//������� ����������� ��� �� �������
		System.out.println("����������� ��� = "+ (height-100)+"��");
		//���������� ��� ������������ � ����������� � ������� ������������
		if (weight>height-100)
			System.out.println("���������� ��������.");
		if (weight==height-100)
			System.out.println("����������� � ��� �� ����.");
		if (weight<height-100)
			System.out.println("���������� ������� ���.");
	}
}
