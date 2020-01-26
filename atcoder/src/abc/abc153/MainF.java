package abc.abc153;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MainF {

	// TLEです。。
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int a = sc.nextInt();

		HashMap<Integer, Integer> map = new HashMap<>();
		int[] zahyo = new int[n];

		for (int i = 0; i < n; i++) {
			zahyo[i] = sc.nextInt();
			map.put(zahyo[i], ((sc.nextInt() - 1) / a) + 1);
		}

		Arrays.sort(zahyo);

		long attackSum = 0;

		for (int i = 0; i < n; i++) {
			int x = zahyo[i];
			int attackNum = map.get(x);
			if (attackNum < 1) {
				continue;
			}
			attackSum = attackSum + attackNum;
			map.put(zahyo[i], map.get(zahyo[i]) - attackNum);
			int p = 1;
			while (true) {
				if (i + p > n - 1) {
					p--;
					break;
				}
				if (zahyo[i + p] <= x + 2 * d) {
					map.put(zahyo[i + p], map.get(zahyo[i + p]) - attackNum);
					p++;
				} else {
					p--;
					break;
				}
			}
		}

		print(attackSum);
		sc.close();
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}