package algorithm.Step01;

import java.util.Scanner;

public class Step01_007 { // scanner �� ����Ͽ� A B ���� �ް� A ���ϱ� B �� �ض�

	public static void main(String[] args) { // ���θ޼���
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ����Ҷ� ���� ��
//		System.out.print("���� ���� ù��°, �ι�° �� �Է��ϼ��� Ex) 2 X 3 �̸� 2, 3");
		int A = scanner.nextInt(); // ��ĳ�ʿ� �ִ� ����� ù������ ���� Int�� ���� ���� ����
		int B = scanner.nextInt(); // ��ĳ�ʿ� �ִ� ����� �ι����� ���� Int�� ���� ���� ����
		scanner.close(); // ��ĳ�� ����
		System.out.println(A * B); // A ���ϱ� B

	}

}
