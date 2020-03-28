package abc.panasonic2020;

import java.math.BigInteger;
import java.util.Scanner;

public class MainC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(String.valueOf(sc.nextLong()));
		BigInteger b = new BigInteger(String.valueOf(sc.nextLong()));
		BigInteger c = new BigInteger(String.valueOf(sc.nextLong()));
		sc.close();

		boolean negative = c.compareTo(a.add(b)) != 1;
		if (negative) {
			print("No");
			return;
		}

		BigInteger two = new BigInteger("2");
		BigInteger aa = a.multiply(a);
		BigInteger bb = b.multiply(b);
		BigInteger cc = c.multiply(c);
		BigInteger ab = a.multiply(b);
		BigInteger bc = b.multiply(c);
		BigInteger ca = c.multiply(a);

		BigInteger num1 = two.multiply(ab.add(bc).add(ca));
		BigInteger num2 = aa.add(bb).add(cc);

		boolean ans = num1.compareTo(num2) == -1;

		printBool(ans);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

	public static void printBool(boolean bool) {
		print(bool ? "Yes" : "No");
	}

}
