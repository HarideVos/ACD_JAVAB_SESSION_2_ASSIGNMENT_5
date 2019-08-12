package twopointfive;
import java.util.Scanner;

public class DumboCombo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of alphabets: ");
		int n = sc.nextInt();
		System.out.print("Enter your alphabets(no repeats; only alphabets): ");
		String s = "";
		char c;
		sc.useDelimiter("");
		for (int i = 0; i < n; i++) {
			c = sc.next().charAt(0);
			if (!((c >=65 && c <= 90) || (c >= 97 && c<= 122)) ||
				s.indexOf(""+c) >= 0) {
				i--;
			} else {
				s += c;
			}
		}
		sc.close();
		combos("", s);
	}
	static void combos(String pre, String s) {
		if (s.length() == 1) {
			System.out.println(pre + s);
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (i + 1 < s.length()) {
					combos(pre + s.charAt(i), s.substring(0, i) + s.substring(i+1));
				} else {
					combos(pre + s.charAt(i), s.substring(0, i));
				}
			}
		}
	}
	
}