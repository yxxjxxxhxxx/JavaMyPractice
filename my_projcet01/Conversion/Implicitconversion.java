package my_projcet01.Conversion;

public class Implicitconversion { //  �ڵ� ����ȯ
	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum; // byte ���� int ������ �ڵ� �� ��ȯ��
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2; // int ���� float ������ �ڵ� �� ��ȯ��
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum = iNum2 + fNum;
		System.out.println(dNum);
		
		
	}
	
	
	
}
