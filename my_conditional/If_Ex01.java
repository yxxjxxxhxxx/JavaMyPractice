package my_conditional;

public class If_Ex01 {

	public static void main(String[] args) {
		int age = 7;
		
		if (age < 8) { // 이곳에 ; 를 넣어서 else 에 Syntax error on token "else", delete this token 오류발생
			System.out.println("학교에 다니지 않습니다.");
		}
		else { // Syntax error on token "else", delete this token 
			System.out.println("학교에 다닙니다.");
		}
		

	}

}
