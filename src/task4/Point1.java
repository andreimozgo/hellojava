package task4;
import java.util.Scanner;
/* � ������ ����� ������ k-� ����� �������� �������� �������� 
 * c ����������. ���� k ������ ����� �����, ������������� �� ���������.
 */

public class Point1 {

	public static void main(String[] args) {
		String str = " ������ ������ ��� ������ "; //������ ������
		Scanner input = new Scanner(System.in); //Scanner ��� ����� ��������
		int k=4;//����� ����� � �����, ������� �� ����� ������ �� ����� ������
		int n=0;//������ �������
		//������ ��������, � ������� ����� ������������� ������
		char [] strChar = str.toCharArray(); 
		//�������� ���������� ������� ����� ���
		char newLetter;

		//������ ������ � ����������
		System.out.println("������� ������: ");
		//��������� ������ � ������
		newLetter=input.nextLine().charAt(0);
		//���������� ������. ���� ������ �� ����� �������, �� ������� �������
		//����� ������ ������� � ������������� ���������� ������� ����� ������ ������
		for(int i=0;i<strChar.length-1;i++){
			if (strChar[i]!=' '){
				n++;
				//����� ������� ���������� ����� k �������� ������
				if(n==k){
					strChar[i]=newLetter;
				}
			}
			else{
				//���� ������ ����� �������, �������� �������
				n=0;
			}
		}
		//������� ������ �� ������� ��������
		str=new String(strChar);
		//������� �� �� ������.
		System.out.println(str);
		//��������� Scanner
		input.close();

	}
}


