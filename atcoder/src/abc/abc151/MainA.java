package abc.abc151;

import java.util.Scanner;

public class MainA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		char ch = c.charAt(0);
		ch++;
		print(ch);
		sc.close();
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
