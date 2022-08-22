package my_random;

public class My_random2 { // 기프티콘 랜덤 숫자 만들기
// print 와 println 의 차이점을 알게되었다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lotto[] = new int[6];	// 로또 번호를 입력받을 배열을 선언해준다.		
		System.out.print("로또 번호 : ");
		for(int i = 0; i < lotto.length; i++) {
			int num = (int)(Math.random() * 45) + 1;	// 1~46까지의 임의의 수를 받는다.
			lotto[i] = num;
			System.out.print(lotto[i] + " ");	// 로또번호를 출력한다.
		}
	}
}
	
