package Task3;

public class Point4 {
//������� � �������������� ������. �������������� ����������.
	public static void main(String[] args) {
		int [] myArray ={5,8,3,6,222,765,89,66,44,29,444,1,7,55,78};
		int max=myArray[0];//��������� ������������ �������
		int maxIndex=0;//������ ������������� ��������
		//����� ������������� �������� � ��� �������
		for(int i=1;i<15;i++){
			if (max<myArray[i]){
				max=myArray[i];
				maxIndex=i;
			}
		}
		System.out.println("������������ �������: "+max+"\n��� ������: "+maxIndex);
	}

}
