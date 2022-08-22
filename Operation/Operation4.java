package Operation;

import java.net.Socket;

public class Operation4 {

	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore = gameScore++;  // 150을 lastScore 에 대입 하고 +1 대기
		System.out.println(lastScore);// 150 출력 후 +1
		int lastScore3 = gameScore;
		System.out.println(lastScore3);
										// 현재 gameScore 은 151
		int lastScore2 = gameScore--;  // 151 값을 lastScore2 에 대입 하고 -1 대기
		System.out.println(lastScore2);// 151 출력 후 -1
										// 현재 gameScore 은 150
		int num = 8;
		System.out.println(num += 10);
		
		
		
	}

}
