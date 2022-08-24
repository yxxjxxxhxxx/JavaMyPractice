import java.util.Scanner;
 public class Main { // 문제 제출용 클래스 
 
	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력:");
		int A = scanner.nextInt();
		int B = scanner.nextInt();		
		System.out.println(A+B);
		scanner.close();			
	}
}