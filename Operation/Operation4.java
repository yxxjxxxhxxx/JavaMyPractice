package Operation;

import java.net.Socket;

public class Operation4 {

	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore = gameScore++;  // 150�� lastScore �� ���� �ϰ� +1 ���
		System.out.println(lastScore);// 150 ��� �� +1
		int lastScore3 = gameScore;
		System.out.println(lastScore3);
										// ���� gameScore �� 151
		int lastScore2 = gameScore--;  // 151 ���� lastScore2 �� ���� �ϰ� -1 ���
		System.out.println(lastScore2);// 151 ��� �� -1
										// ���� gameScore �� 150
		int num = 8;
		System.out.println(num += 10);
		
		
		
	}

}
