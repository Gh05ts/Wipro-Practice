package array;

public class SixSeven {

	public static void main(String[] args) {
		int[] list = {2, 45, 64, 6, 55, 7, 334};
		int six = -1;
		int sev = -1;
		int sum =0;
		
		for (int i = 0; i < list.length; i++) {
			if(list[i] == 6)	six = i;
			if(list[i] == 7)	sev = i;
		}
		
		if(sev == -1) six = -1;
		
		for (int i = 0; i < list.length; i++) {
			if(six != 1 && i >= six && i <= sev) continue;
			sum += list[i];
			
		}
		
		System.out.print("Sum is: " + sum);
	}

}
