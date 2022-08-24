import java.util.Scanner; // 자바 스캐너를 사용하기 위한 Scanner import
public class MainTest { // 문제 제출연습용 클래스

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 스캐너를 사용하려고 쓴코드
		System.out.print("뺄 숫자를 입력 : "); // 사용자에게 콘솔에서 보여질 문구
		// 이제부터 사용자가 콘솔창에 숫자를 한번, 두번 입력하면 A, B에 값이 들어감
		int A = scanner.nextInt(); // int 타입의 A 변수를 만들고 scanner 의 기능중 인트값을 받는 nextInt() 기능을 넣음
		int B = scanner.nextInt(); // int 타입의 B 변수를 만들고 scanner 의 기능중 인트값을 받는 nextInt() 기능을 넣음
		scanner.close(); // 더이상 값을 받지 않음
		System.out.println(A-B); // 스캐너로 입력 받은 A 값 B 값을 뺀다.
	}
}
