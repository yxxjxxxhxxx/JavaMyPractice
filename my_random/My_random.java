package my_random;

public class My_random { // ����Ƽ�� ���� ���� �����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gifticonRandom[] = new int[12];
		System.out.print("����Ƽ�� ��ȣ : ");
		for(int i=0; i < gifticonRandom.length; i++) {
			int num = (int)(Math.random() * 9) +1;
			gifticonRandom[i] = num;
			
			System.out.print(gifticonRandom[i] + " ");
		}

	}

}
