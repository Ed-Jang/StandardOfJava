
class ArrayEx8 {
	public static void main(String[] args) {
		int[] ball = new int[45]; // 45개 정수 배열

		// 배열에 1~45 저장
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;// ball i번째 index에 i+1 대입
		}

		int temp = 0; // 빈컵 역할(두 컵의 내용물을 바꿀때 반드시 다른 빈컵이 필요)
		int j = 0; // 임의의 값을 얻어서 저정할 변수

		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다
		// 0~5까지 모두 6개만 바꾼다
		for (int i = 0; i < 6; i++) {
			j = (int) (Math.random() * 45);// 0~44의 임의의 값을 얻는다
			// ball[i]와 ball[j]를 바꿈
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}

		// 배열 ball의 앞에서부터 6개의 요소 출력 (1~45카드를 위에서부터 6장 뽑는것)
		for (int i = 0; i < 6; i++) {
			System.out.printf("ball[%d] = %d\n", i, ball[i]);
		}
	}
}
