package Task2;
import java.util.Scanner; //����������� ����� Scanner
public class Task2Point7 {

	public static void main(String[] args) {
		//������� ������ ������ Scanner ��� ����� ������
		Scanner input = new Scanner(System.in); 
		int day=0;
		
		System.out.println("������� ����� ��� ������: ");
		day = input.nextInt(); //����� ����� ���
		//���� ����� ������ 0 � ������ 8, �� ������� ��������������� ���� ������		
		if (day>0&&day<8){ 
			switch (day) {
				case 1: System.out.println("�����������");
					break;
				case 2: System.out.println("�������");
					break;
				case 3: System.out.println("�����");
					break;	
				case 4: System.out.println("�������");
					break;
				case 5: System.out.println("�������");
					break;
				case 6: System.out.println("�������");
					break;
				case 7: System.out.println("�����������");
			}
		}
			//���� ����� �� � ������ ��������� ������� ��������� �� ������
			else System.out.println("�� ����� �������� �����.");
	}

}
