package array;

public class Repeat {
	static int num;
	public static void main(String args[]) {
		
		int[] list = {2, 33, 22, 33, 14, 2, 67};
		list = Sort.mergesort(list);
		
		for (int i = 0; i < list.length; i++) {
			if(num != list[i]) {
				num = list[i];
				System.out.print(list[i]+ " ");
			}
			
		}
		
	}

}
