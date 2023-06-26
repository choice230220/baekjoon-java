import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int num = sc.nextInt();
		int k = 1;
		int total = 0;
		
		while (k < num + 1) {
			total += sc.nextInt() * sc.nextInt();
			k++;
		}
		
		System.out.println((price == total)?"Yes":"No");
	}

}