package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		int n = unsortedArray.length;
		boolean swapped = true;

		while (swapped) {
			swapped = false;
			for (int i = 1; i < n; i++) {
				if (unsortedArray[i] < unsortedArray[i - 1]) {
					int tmp = unsortedArray[i];
					unsortedArray[i] = unsortedArray[i - 1];
					unsortedArray[i - 1] = tmp;

					swapped = true;
				}
			}
		}
		
		return unsortedArray;
	}
}
