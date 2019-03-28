package Practice;
import java.util.Scanner;

public class Color {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Color Alphabet: ");
		char color = sc.next().charAt(0);
		sc.close();
		char colour = Character.toUpperCase(color);
		
		switch (colour) {
		case 'R':
			System.out.print("Color is Red");
			break;
		case 'G':
			System.out.print("Color is Green");
			break;
		case'B':
			System.out.print("Color is Blue");
			break;
		case 'O':
			System.out.print("Color is Orange");
			break;
		case 'Y':
			System.out.print("Color is Yellow");
			break;
		case 'W':
			System.out.print("Color is White");
			break;
		default:
			System.out.print("No such color");
					
		}

	}

}
