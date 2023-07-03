package Service;

public class MergeSort {
	public void mergeSort(int array[], int left, int right) {
		if(left < right) {
			int mid = (left + right) / 2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			merge(array, left, mid, right);
		}
	}
	
	void merge(int array[], int left, int mid, int right) {
		int length1 = mid - left + 1;
		int length2 = right - mid;
		int leftArray[] = new int[length1];
		int rightArray[] = new int[length2];
		
		for(int i = 0; i < length1; i++ ) {
			leftArray[i] = array[left + i];
		}
		
		for(int j = 0; j < length2; j++ ) {
			rightArray[j] = array[mid + 1 + j];
		}
		
		int i, j, k;
		i = 0;
		j = 0;
		k = left;
		
		while(i < length1 && j < length2) {
			if(leftArray[i] >= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i < length1) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		
		while(j < length2) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
		
	}

}
