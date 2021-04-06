import java.util.Scanner;

class FlowEx5 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("점수를 입력해주세요");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); //화면을 통해 입력받은 점수를 score에 저장
		
		System.out.printf("당신의 점수는 %d입니다\n",score);
		
		if(score >= 90) { //score가 90점 보다 크거나 같으면 A
			grade = 'A';
			if(score >= 98) {//그 중에 98이상은 A+
				opt = '+';
			}
			else if (score < 94) {
				opt = '-'; //90~94는 A-
			}
		}
		else if (score >= 80) {//score가 80점보다 크거나 같으면 B
			grade = 'B';
			if (score >= 88) {//그중에 88이상은 B+
				opt = '+';
			}
			else if (score < 84) {
				opt = '-';
			}
		}
		else {//나머지는 C
			grade = 'C';
		}
		System.out.printf("학점은 %c%c입니다 \n",grade,opt);
	}
}
