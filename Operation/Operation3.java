package Operation;

public class Operation3 {

	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore = ++gameScore;  // 150 + 1 �� �����ϰ� lastScore �� ���Ե�
		System.out.println(lastScore);// 151 ���
		
		int lastScore2 = --gameScore;  // 151 �̵� gameScore ���� 151 -1 �� �ϰ� lastScore2 �� ���Ե�
		System.out.println(lastScore2);// 150 ���
	}

}
