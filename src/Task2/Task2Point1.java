package Task2;

public class Task2Point1 {
	public static void main(String[] args) {
	String str = "������ � ����� �������";	
	String strPart1 = ""; //������ ����� ������
	String strPart2 = "";  //������ ����� ������
	
	//������� ���������� �������� � ������
	System.out.println("���������� �������� � ������: "+ str.length());
	//����� �������� ������ �� ���
	strPart1=str.substring(0,str.length()/2);
	strPart2=str.substring(str.length()/2);
	//������� ��� ����� ������
	System.out.println("������ ����� ������: "+strPart1+ "\n" +"������ ����� ������: "+strPart2);
	}
}
