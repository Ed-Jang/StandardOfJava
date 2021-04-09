
class ArrayEx6 {
	public static void main(String[] args) {
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0]; // 배열의 첫 번째 값으로 최대값을 초기화
		int min = score[0]; // 배열의 첫 번째 값으로 최소값을 초기화

		for (int i = 1; i < score.length; i++) {// 배열의 두번째 요소부터 읽기위해 i를 1(두번째)부터 시작
			if (score[i] > max) {//score[i]가 크면
				max = score[i];//max변수에 그 값을 대입
			} else if (score[i] < min) {//score[i]가 작으면
				min = score[i];//min변수에 그 값을 대입
			}
		}//end of for
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}//end of main
}
