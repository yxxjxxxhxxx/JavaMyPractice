package my_projcet01.Conversion;

public class ExplicitConversion { // �и��� ������
	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2; // �� �Ǽ��� ���� �� ��ȯ�Ǿ� ������
		int iNum4 = (int)(dNum1 + fNum2);    // �� �Ǽ��� ���� ���� ���ǰ� �� ��ȯ��
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		int iNum5 = 10;
		double dNum2 = 2.0;
		System.out.println(iNum5 + dNum2);
		System.out.println(iNum5 + (int)dNum2);
		char x = '\uAE00';
        System.out.println(x);
        char y = 65;
        System.out.println(y);
	}
	

}
