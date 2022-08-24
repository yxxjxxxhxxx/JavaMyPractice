package algorithm.Step01;
import java.util.Scanner;
 public class Step01_005 { // 값을 받고 A + B 를 해라
 
	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력:");
		int A = scanner.nextInt();
		int B = scanner.nextInt();		
		System.out.println(A+B);
		scanner.close();			
	}
}