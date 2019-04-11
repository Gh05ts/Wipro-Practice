package array;

public class Search {

	public static void main(String[] args) {
		
		int[] numbers = {3, 45, 23, 45, 234};
		int check = 2345;
		int index = 0;
		for(int i: numbers) {
			if(check == i) {
				System.out.println(index);
			}
			index++;
			if(index == numbers.length && check!= i) {
				System.out.print(-1);
			}

		}
	}
	
}
