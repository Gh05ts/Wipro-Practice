package array;

public class RepeatOffenders {

	public static void PrintwoRepeat(int[] list) {
		int[] count = new int[50];
		for(int i = 0;i < 45;i++) {
			if(count[list[i]] >= 1)
				continue;
			else {
				System.out.print(list[i] + " ");
				count[list[i]]++;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] list = {45, 32, 42, 23, 45, 32, 46};
		PrintwoRepeat(list);
	}

}
