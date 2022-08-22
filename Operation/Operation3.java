package Operation;

public class Operation3 {

	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore = ++gameScore;  // 150 + 1 을 먼저하고 lastScore 에 대입됨
		System.out.println(lastScore);// 151 출력
		
		int lastScore2 = --gameScore;  // 151 이된 gameScore 에서 151 -1 을 하고 lastScore2 에 대입됨
		System.out.println(lastScore2);// 150 출력
	}

}
