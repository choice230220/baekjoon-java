import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int k = 1;
		
		while (k < i + 1) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
			k++;
		}
	}

}