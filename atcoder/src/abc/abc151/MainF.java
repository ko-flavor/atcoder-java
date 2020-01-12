package abc.abc151;

import java.util.Scanner;

public class MainF {

	// WAです。2点間の距離が一番長いところを求めているのですが、
	// 最も長い2点を直径とする円を描いても、点がはみ出る可能性を考慮できていません。
	// 0,0 と0,20が一番遠い距離だったら、10,13なんかが今はみ出しちゃう。
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double maxLen = 0;
		int[][] point = new int[n][2];
		for (int i = 0; i < n; i++) {
			point[i][0] = sc.nextInt();
			point[i][1] = sc.nextInt();
			for (int j = 0; j < i; j++) {
				double len = calcLen(point[i], point[j]);
				if (len > maxLen) {
					maxLen = len;
				}
			}
		}
		print(maxLen / 2);
		sc.close();
	}

	public static double calcLen(int[] point1, int[] point2) {
		return Math.sqrt(
				(point2[0] - point1[0]) * (point2[0] - point1[0]) + (point2[1] - point1[1]) * (point2[1] - point1[1]));
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
