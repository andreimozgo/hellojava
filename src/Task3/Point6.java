package Task3;
//������ �� ������� ���������� ������������� ��������� � �������
public class Point6 {

	public static void main(String[] args) {
		int [] myArray = {5,8,3,-6,222,765,-89,66,44,-29};
		int count=0;//��������� �������� �������� 0
		//���������� ������ � ���������� � count 1, ���� ������� �������������
		for(int val:myArray){
			if(val<0)
				count++;
		}
		//������� ���������
		System.out.println("���������� ������������� ���������: "+count);
	}

}
