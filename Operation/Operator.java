package Operation;

public class Operator {

	public static void main(String[] args) {
		int num = 10;
		System.out.println(+num + " +num �� ��");
		System.out.println(-num + " -num �� ��");
		System.out.println(num + " -num �� �ѵ��� num ��");
		
		num = -num;  // num �����տ� - �� �ٿ��� num �ȿ� �ֱ� 
		System.out.println(num); // -10 �� ���
		
		System.out.println(10 / 2);
		System.out.println(10 % 2);

	}

}
