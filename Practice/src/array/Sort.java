package array;

public class Sort {

	public static void main(String[] args) {	
		int[] list = {4, 23, 44, 556, 23, 56, 45, 5565, 22};
		System.out.print("Initial List: ");
		Print(list);
		list = mergesort(list);
		System.out.print("Sorted List: ");
		Print(list);
		
	}
	
	public static void Print(int[] list) {
		int flag = 0;
		for(int i: list) {
			if(flag == 0) { System.out.print(i);
			flag++;
			}
			else
			System.out.print(", " + i);
		}
		System.out.println();
	}
	
	public static int[] mergesort(int[] list) {
		if (list.length == 1) {
			return list;	
		}
		
		int mid = list.length / 2;
		int[] left = new int[mid];
		int[] right= new int[(list.length) - mid];
		
		for(int i = 0; i < left.length; i++)
			left[i] = list[i];
		for (int j = 0; j < right.length; j++)
			right[j] = list[j + mid];
		
		return merge(mergesort(left), mergesort(right));
	}

	public static int[]	merge(int[] left, int[] right) {
		
		int[] sorted = new int[left.length + right.length];
		int i = 0; int j = 0;
		for (int k = 0; k < sorted.length; k++) {
			if(i >= left.length) sorted[k] = right[j++];
			else if(j >= right.length) sorted[k] = left[i++];
			else if(left[i] <= right[j]) sorted[k] = left[i++];
			else sorted[k] = right[j++];
		}
		
		return sorted;
	}
}
