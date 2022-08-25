package algorithm.Step01;

import java.util.Scanner;

public class Step01_007 { // scanner 를 사용하여 A B 값을 받고 A 곱하기 B 를 해라

	public static void main(String[] args) { // 메인메서드
		Scanner scanner = new Scanner(System.in); // 스캐너 사용할때 쓰는 것
//		System.out.print("곱할 숫자 첫번째, 두번째 를 입력하세요 Ex) 2 X 3 이면 2, 3");
		int A = scanner.nextInt(); // 스캐너에 있는 기능중 첫번쨰로 받은 Int로 받은 값을 저장
		int B = scanner.nextInt(); // 스캐너에 있는 기능중 두번쨰로 받은 Int로 받은 값을 저장
		scanner.close(); // 스캐너 종료
		System.out.println(A * B); // A 곱하기 B

	}

}
