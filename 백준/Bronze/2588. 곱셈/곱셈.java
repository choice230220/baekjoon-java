import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		
		for(int i = b.length() - 1; i > -1; i--) {
			System.out.println(a * ((int) b.charAt(i) - 48));
		}
		System.out.println(a * Integer.parseInt(b));
	}

}