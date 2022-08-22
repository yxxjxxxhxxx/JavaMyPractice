package my_projcet01;

public class Constant { // 상수

	public static void main(String[] args) {
		final double PI = 3.14;
		final int MAX_NUM = 300;
		final int MIN_NUM;
		MIN_NUM = 1; // 사용 하기 전에 초기화 초기화 하지 않으면 오류 발생
	  //MIN_NUM = 1000; // 오류 발생 상수는 값을 변경할 수 없음
		
		System.out.println(PI);
		System.out.println(MIN_NUM); // 메이플 1레벨
		System.out.println(MAX_NUM); // 메이플 만렙 300
	  
	}

}
