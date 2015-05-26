package Round305;

import java.util.Scanner;

public class A_MikeAndFax {
	static boolean isPalyndrom(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		if (s.length() % k != 0) {
			System.out.println("NO");
			return;
		} else {
			boolean ok = true;
			int d = s.length() / k;
			for (int i = 0; i <= s.length() - d; i += d) {
				ok &= isPalyndrom(s.substring(i, i + d));
			}
			if (ok) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
