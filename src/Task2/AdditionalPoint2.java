package Task2;
import java.util.Scanner; 
public class AdditionalPoint2 {
	public static void main (String args[]){

		int n=0;
		double sum=0;
		Scanner input = new Scanner(System.in);//������� ������ ������ Scanner ��� ����� ������

		System.out.println("������� n:");
		n=input.nextInt();//������ ����� n

		if (n>0)//���� n>0 ��������� ���� ������������
			for (int i=1;i<n+1;i++){
				//��������� ������������ ��������� �� �������, ������� ����
				//�� ����� �� ����� (1.0)
				sum=sum+1.0/i; 
			}	
		System.out.println(sum);//������� �����
	}



}
