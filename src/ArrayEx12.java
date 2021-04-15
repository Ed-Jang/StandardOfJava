
class ArrayEx12 {
	public static void main(String[] args) {
		String[] names = {"kim","Park","Yi"};//new String[] 를 생략 가능
		
		for(int i = 0; i<names.length; i++) {
			System.out.println("names["+i+"]:"+names[i]);
		}
		
		String tmp = names[2]; //배열 names의 세번 째 요소를 tmp에 저장
		System.out.println("tmp:"+tmp);
		names[0] = "Yu"; //배열 name의 첫 번째 요소를 "Yu"로 변경
		
		for(String str : names) //향상된 for문을 이용
			System.out.println(str);
	}
}
