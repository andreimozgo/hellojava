package Task3;

public class Point1 {

	public static void main(String[] args) {
//������� ������ �� 10�� ��������� ���� float � �������������� ���
		float [] myArray = {1.2f,4f,6.5f,4.2f,3.9f,7.1f,8.8f,2.9f,6.6f,22.1f};
		float average =0f;//���������� ��� ������� �������� ���������������
//������� �� ������ ������
		for (int i=0;i<myArray.length;i++){
			System.out.print(myArray[i]);
			//�������� ������� ��������� �������� |
			if (i<myArray.length-1)
				System.out.print("|");
		}
		//������� ������� ��������������
		for (int i=0;i<myArray.length;i++){
			average+=myArray[i];
		}
		average/=myArray.length;
		//������� ������� �������������� �� ������
		System.out.print("\naverage value = "+average);
	}

}
