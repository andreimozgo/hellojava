package Task3;

public class Point5 {

	public static void main(String[] args) {
		//������� � �������������� ������. ������ ����������.
		int [] myArray ={5,8,3,6,222,765,89,66,44,29,444,1,7,55,78};
		int min=myArray[0];//��������� ����������� �������
		int minIndex=0;//��������� ������ ������������ ��������
		//����� ������������ �������� � ��� �������
		for(int i=1;i<15;i++){
			if (min>myArray[i]){
				min=myArray[i];
				minIndex=i;
			}
		}
		System.out.println("����������� �������: "+min+"\n������ ������������ ��������: "+ minIndex);
	}
}

