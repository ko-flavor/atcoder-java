package abc.abc152;

import java.util.Scanner;

public class MainA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		print(n == m ? "Yes" : "No");
		sc.close();
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
