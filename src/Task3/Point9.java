package Task3;

public class Point9 {
//� ������� �� 10 ����� ����������� ��� ���� � ����� �������, 
//�� ����� ������� �� ������� ���������. 

	public static void main(String[] args) {
		int [] myArray = {5,8,3,-6,222,0,-89,0,44,6};
		int count=0;//������� �����
		//���������� ������ ���� �� �������������� ��������
		//(�.�. ���� ��������� 0 ����������� ��� �� ����), 
		//� ���� ��������� �� ����(�� ���� ���� �� ����), 
		//�� �� ����� ��� ���������� � ���� ����
		//���� �� ���������� �������� ����� ���������� ��� ��������� 0, 
		//�.�. ��� ��� ����� ����������� � ����� �� ������ ���������� ����� 
		for(int i=0;i<myArray.length-count-1;i++){
			if(myArray[i]==0){//���� ������� = 0
				//������� ��������
				count++;
				//� ����������� �������� �� �������
				for(int j=i;j<myArray.length-count;j++){
					myArray[j]=myArray[j+1];
				}
				//���������� �������� ����������� 0
				myArray[myArray.length-count]=0;
			}
		}
		for(int val:myArray){
			System.out.print(val+" ");
		}
	}

}
