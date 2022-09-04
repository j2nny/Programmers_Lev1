package level1;

import java.util.Scanner;

public class SquareStar {

	public SquareStar(int a, int b) {
		
		for (int i = 0; i < b; i++) {
			System.out.println("*".repeat(a));
		}
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        new SquareStar(a, b);
	}

}
