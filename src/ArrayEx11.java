
class ArrayEx11 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10);// 0~9 임의의 수 배열에 저장
			System.out.print(numArr[i]); //임의의 수 출력
		}
		System.out.println();

		for (int i = 0; i < numArr.length; i++) {
			counter[numArr[i]]++; //numArr[i]에 저장된 값과 일치하는 counter[index]를 1증가
									//만약 numArr[0]가 5라면 counter[5] 값을 1증가 시킴
		}

		for (int i = 0; i < numArr.length; i++) {
			System.out.println(i + "의 개수 :" + counter[i]);
		}

	}
}
