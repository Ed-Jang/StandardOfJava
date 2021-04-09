import java.util.Arrays;

class ArrayEx9 {
	public static void main(String[] args) {
		int[] code = { -4, -1, 3, 6, 11 };// 불연속적인 값으로 구성된 배열
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int tmp = (int) (Math.random() * code.length);// tmp에 code[index]중 임의의 값 대입
			arr[i] = code[tmp];//code[tmp]을 arr[i]에 대입
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
