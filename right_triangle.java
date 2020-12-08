
import java.util.Scanner;

public class right_triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		
		while(true) {
			System.out.print("Enter n");
			n = input.nextInt();
			
			if(n < 1 || n > 12) {
				System.out.println("Input should only from 1 -12");
			}else {
				break;
			}
		}
		
		for(int i = 1; i<=n; i++) {
			int k = i;
			for(int j = 1; i>=j; j++) {
				System.out.print(k+" ");
				k += n-j;
			}
			System.out.println();
		}

	}

}
