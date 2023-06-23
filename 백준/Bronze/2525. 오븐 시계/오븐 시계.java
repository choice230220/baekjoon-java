import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();
		
		int total = hour * 60 + min + time;
		
		min = total % 60;
		hour = total / 60;
		
		if(hour >= 24) {
			hour -= 24;
		}
		
		System.out.println(hour + " " + min);
	}

}