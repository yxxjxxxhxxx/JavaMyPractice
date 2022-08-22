package Operation;

public class Operator {

	public static void main(String[] args) {
		int num = 10;
		System.out.println(+num + " +num 의 값");
		System.out.println(-num + " -num 의 값");
		System.out.println(num + " -num 을 한뒤의 num 값");
		
		num = -num;  // num 변수앞에 - 를 붙여서 num 안에 넣기 
		System.out.println(num); // -10 이 출력
		
		System.out.println(10 / 2);
		System.out.println(10 % 2);

	}

}
