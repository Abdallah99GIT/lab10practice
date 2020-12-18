public class SelectionSort {
	private int temp;

public SelectionSort() {


}//end SelectionSort

public int[] basicSelectionSort(int[] x) {
	for (int i = 0; i < x.length; ++i) {
		for (int j= i+1; j < x.length; ++j) {
			if (x[i] > x[j]) {
				temp = x[i];
				x[i] = x[j];
				x[j] = temp;
				}//end if
		}//end for
	}//end for
	return x;

}//end BasicSelectionSort

}//end class SelectionSort
