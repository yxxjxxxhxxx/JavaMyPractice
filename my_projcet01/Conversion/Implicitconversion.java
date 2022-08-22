package my_projcet01.Conversion;

public class Implicitconversion { //  자동 형변환
	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum; // byte 형이 int 형으로 자동 형 변환됨
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2; // int 값이 float 형으로 자동 형 변환됨
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum = iNum2 + fNum;
		System.out.println(dNum);
		
		
	}
	
	
	
}
