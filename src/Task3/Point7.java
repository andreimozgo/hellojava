package Task3;
//������ �� ���������� ����� ��������� ������� �� ������� 0
public class Point7 {

	public static void main(String[] args) {
		int [] myArray = {5,8,3,-6,222,765,-89,0,44,-29};
		int sum=0;//����� ���������
		//���������� ������ � ���������� ��� ��������, 
		//���� ������� ����� 0, ���� �����������
		for(int val:myArray){
			sum+=val;
			if (val==0)
				break;
		}
		System.out.println("����� ��������� �� ������� 0 = "+sum);

	}

}
