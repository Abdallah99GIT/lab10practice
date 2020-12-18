import static org.junit.Assert.*;
import org.junit.Assert;
import java.util.Arrays;
import org.junit.Test;


public class testSelectionSort {
	SelectionSort sort = new SelectionSort();

	@Test
	public void test() {

		testMixed();
		testDuplicates();
		}
	public testSelectionSort() {

	}//end testSelectionSort


	public void testMixed(){           /** Test data contains with both positive, negative and zeros **/

		int[] arr = new int[] {8,-9,7,-10,2,0};
		int[] sor = new int[] {-10,-9,0,2,7,8};
		sort.basicSelectionSort(arr);
		assert(Arrays.equals(arr,sor));
		}

	public void testDuplicates(){        /** Test data contains duplicates **/
		int[] arr = new int[] {-8,-9,7,7,-8,2,-10,7,0};
		int[] sor = new int[] {-10,-9,-8,-8,0,2,7,7,7};
		sort.basicSelectionSort(arr);
		assert(Arrays.equals(arr,sor));
		}

	}//end class TestselectionSort
