import java.util.Arrays;

public class BubbleSortTest{
	
	public static void swap(Integer[] array, int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void bubbleSort(Integer[] array){
		int n = array.length;
		for (int i = 0; i < n-1; i++){
			for (int j = 0; j < n-1-i; j++){
				if (array[j] > array[j+1]){
					swap(array, j, j+1);
				}
			}
		}
	}
	
	public static void main(String[] args){
		Integer[] a = new Integer[] {8, 3, 1, 4, 5, 11, 7, 2, 17, 13};
		System.out.println("Array before sorting:");
		System.out.println(Arrays.deepToString(a));
		
		bubbleSort(a);
		
		System.out.println("Array after sorting:");
		System.out.println(Arrays.deepToString(a));
	}
}