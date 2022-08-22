package my_random;

public class My_random { // 기프티콘 랜덤 숫자 만들기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gifticonRandom[] = new int[12];
		System.out.print("기프티콘 번호 : ");
		for(int i=0; i < gifticonRandom.length; i++) {
			int num = (int)(Math.random() * 9) +1;
			gifticonRandom[i] = num;
			
			System.out.print(gifticonRandom[i] + " ");
		}

	}

}
