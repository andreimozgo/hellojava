package Task3;

public class Point2 {

	public static void main(String[] args) {
		//������ ������ � ����������. �������������� ��
		int [] myArray ={5,8,3,6,222,765,89,66,44,29};
		int max = myArray[0];
		int min = myArray[0];
		//���������� ������ � ����������� ���������� �������� �������� ������� 
		//� ������ ���������� �������
		for(int i=1;i<myArray.length;i++){
			if (max<myArray[i])
				max=myArray[i];
			if (min>myArray[i])
				min=myArray[i];
		}
		//����� �����������
		System.out.printf("min value = %3d%nmax value = %d%n", min,max);
	}

}
