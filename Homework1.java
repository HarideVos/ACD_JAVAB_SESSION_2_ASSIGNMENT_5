package twopointfive;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printEven();
		printOdd(19, 3);
	}
	
	public static void printEven(){
		for(int i = 2; i <= 100; i+= 2){
			System.out.print(i + ", ");
		}
		System.out.println();
	}
	
	public static void printOdd(int n, int s){
		for(int i = s; i < (s + n * 2); i += 2){
			System.out.print(i + ", ");
		}
		System.out.println();
	}
}
	