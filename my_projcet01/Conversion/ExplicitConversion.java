package my_projcet01.Conversion;

public class ExplicitConversion { // 분명한 명쾌한
	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2; // 두 실수가 각각 형 변환되어 더해짐
		int iNum4 = (int)(dNum1 + fNum2);    // 두 실수의 합이 먼저 계산되고 형 변환됨
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
