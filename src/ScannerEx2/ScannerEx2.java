package ScannerEx2;

import java.io.File;
import java.util.Scanner;

class ScannerEx2 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("C:\\Users\\82106\\eclipse-workspace\\StandardOfJava\\src\\ScannerEx2\\data2.txt"));
		int sum = 0;
		int cnt = 0;

		while (sc.hasNextInt()) {
			sum += sc.nextInt();
			cnt++;
		}
		System.out.println("sum=" + sum);
		System.out.println("average=" + (double) sum / cnt);
	}

}
