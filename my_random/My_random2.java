package my_random;

public class My_random2 { // ����Ƽ�� ���� ���� �����
// print �� println �� �������� �˰ԵǾ���.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lotto[] = new int[6];	// �ζ� ��ȣ�� �Է¹��� �迭�� �������ش�.		
		System.out.print("�ζ� ��ȣ : ");
		for(int i = 0; i < lotto.length; i++) {
			int num = (int)(Math.random() * 45) + 1;	// 1~46������ ������ ���� �޴´�.
			lotto[i] = num;
			System.out.print(lotto[i] + " ");	// �ζǹ�ȣ�� ����Ѵ�.
		}
	}
}
	
