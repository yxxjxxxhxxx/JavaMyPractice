import java.util.Scanner; // �ڹ� ��ĳ�ʸ� ����ϱ� ���� Scanner import
public class MainTest { // ���� ���⿬���� Ŭ����

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // ��ĳ�ʸ� ����Ϸ��� ���ڵ�
		System.out.print("�� ���ڸ� �Է� : "); // ����ڿ��� �ֿܼ��� ������ ����
		// �������� ����ڰ� �ܼ�â�� ���ڸ� �ѹ�, �ι� �Է��ϸ� A, B�� ���� ��
		int A = scanner.nextInt(); // int Ÿ���� A ������ ����� scanner �� ����� ��Ʈ���� �޴� nextInt() ����� ����
		int B = scanner.nextInt(); // int Ÿ���� B ������ ����� scanner �� ����� ��Ʈ���� �޴� nextInt() ����� ����
		scanner.close(); // ���̻� ���� ���� ����
		System.out.println(A-B); // ��ĳ�ʷ� �Է� ���� A �� B ���� ����.
	}
}
