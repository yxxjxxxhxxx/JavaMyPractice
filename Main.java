import java.util.Scanner;
 public class Main { // ���� ����� Ŭ���� 
 
	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է�:");
		int A = scanner.nextInt();
		int B = scanner.nextInt();		
		System.out.println(A+B);
		scanner.close();			
	}
}