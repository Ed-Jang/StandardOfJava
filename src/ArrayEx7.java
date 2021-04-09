
class ArrayEx7 {
	public static void main(String[] args) {
		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i;// 배열을 0~9의 숫자로 초기화
			System.out.print(numArr[i]);// 초기화하면서 출력으로 확인 예상 "0123456789"
		}
		System.out.println();

		for (int i = 0; i < numArr.length; i++) {
			int n = (int) (Math.random() * 10);// 0~9중의 한 값을 임의로 얻는다
			// numArr[0]과 numArr[n]의 값을 바꾼다
			int tmp = numArr[0]; // numArr[0]을 tmp변수에 대입,tmp는 빈컵의 역할
			numArr[0] = numArr[n];// numArr[n]값을 numArr[0]에 대입, n값은 랜덤
			numArr[n] = tmp;// numArr[n]값에 tmp대입
		}
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]);// 셔플된 배열을 출력,출력시마다 결과가 다름
		}
	}
}
