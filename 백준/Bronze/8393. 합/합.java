import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 1;
		int result = 0;
		
		while (k < n + 1) {
			result += k;
			k++;
		}
		System.out.println(result);
	}

}