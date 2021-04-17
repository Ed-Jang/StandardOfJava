import java.util.Scanner;

class MultiArrEx4 {
	public static void main(String[] args) {
		//words[i][0]은 문제
		//words[i][1]은 답
		String[] [] words = {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"},
		};
		
		Scanner scanner = new Scanner (System.in);
		
		for(int i = 0 ; i<words.length; i++) {//문제의 개수 만큼 반복(행의 길이)
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if (tmp.equals(words[i][1])) { //입력받은 값이 words[i][1]과 같으면 정답
				System.out.printf("정답\n\n");
			}
			else {//다르면 오답
				System.out.printf("오답, 정답은 %s입니다\n\n",words[i][1]);
			}
		}// end of for
	}
}
