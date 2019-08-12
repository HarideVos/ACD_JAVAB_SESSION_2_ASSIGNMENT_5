package twopointfive;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 244;
		isPrime(x);
		isPalindrome(x);
	}
	
	public static void isPrime(int a){
		boolean check = false;
		for(int i = 2; i < a; i++){
			if(a % i == 0)
				check = true;
			else
				check = false;
		}
		if(check = true)
			System.out.println(a + " is Prime!");
		else
			System.out.println(a + " is not Prime!");
	}
	
	public static void isPalindrome(int a){
		String str = "" + a;
		String drome = "";
		StringBuilder sb = new StringBuilder(str);

		
		if(drome.equals(sb.reverse()))
			System.out.println(str + " is a Palindrome!");
		else
			System.out.println(str + " is not a Palindrome!");
	}
}


