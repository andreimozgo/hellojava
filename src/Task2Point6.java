import java.util.Scanner; //����������� ����� Scanner ��� ����� ������
public class Task2Point6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //������� ������ ������ Scsanner
		short sum = 0;
		
		for (int i = 1; i <= 10; i++){ //���� �� 10�� �������� ��� �������� ��������
			System.out.print("������� ����� � ������ �� 1 �� 999: ");
			sum = input.nextShort();	//��������� ��������� �����		
//���� ��������� ����� ����� 1, �� ��� �� 11, ������� "�����"
			if ((sum%10==1)&&sum!=11)
				System.out.println("�����");
			else {
//��������� ��������� ����� ����� ������ 5 � ������ 20. ���� ��� 2 ��� 3 ��� 4, �� 
//������� "�����"
				if (((sum>20)||(sum<5))&&((sum%10==2)||(sum%10==3)||(sum%10==4)))
					System.out.println("�����");
				else 
//��� ���� ��������� �������: "������"
					System.out.println("������");
			}
		}	
	}
}
