package algorithm.Step01;
import java.util.Scanner;

public class Step01_006 { // 값을 받고 A-B 를 해라

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("뺼 값을 한번, 두번 입력하세요: " );
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		scanner.close();
		System.out.println(A-B);

	}

}
