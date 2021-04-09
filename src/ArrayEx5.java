
class ArrayEx5 {
	public static void main(String[] args) {
		int sum = 0; // 총점
		float average = 0f;// 평균

		int[] score = { 100, 88, 100, 100, 90 };

		for (int i = 0; i < score.length; i++) {
			sum += score[i];// score의 모든 값을 sum에 저장
		}
		average = sum / (float) score.length;// 계산 결과를 float로 얻기 위해 형변환

		System.out.println("총점 : " + sum); //총점 출력
		System.out.println("평균 : " + average);//평균 출력

	}
}
