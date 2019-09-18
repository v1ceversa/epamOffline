package by.epam.task_1.stage_1.utils;

public class Sorter {

	private static int left(int i) {
		return 2 * i + 1;
	}

	private static int right(int i) {
		return 2 * i + 2;
	}
	
	private static <T> void swap(T[] arr, int i, int j) {
		T tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	private static <T extends Comparable<T>> void heapify(T[] arr, int n, int i) 
	{ 
	    int smallest = i;  
	    int l = left(i);  
	    int r = right(i); 
	   
	    if (l < n && arr[l].compareTo(arr[smallest]) > 0) {
	    	smallest = l;  
	    }
	    if (r < n && arr[r].compareTo(arr[smallest]) > 0) {
	    	smallest = r; 
	    }
	    
	    if (smallest != i) { 
	    	swap(arr, i, smallest);  
	    	heapify(arr, n, smallest); 
	    } 
	} 
	  
	
	private static <T extends Comparable<T>> void buildHeap(T arr[], int n)
	{
		for (int i = n / 2 - 1; i >= 0; i--) 
	        heapify(arr, n, i);
	}
	
	private static <T extends Comparable<T>> void heapSort(T arr[], int n) 
	{  
		buildHeap(arr, n);
		
	    for (int i = n - 1; i >= 0; i--) {  
	        swap(arr, 0, i);  
	        heapify(arr, i, 0); 
	    } 
	} 
	
	public static <T extends Comparable<T>> void heapSort(T arr[])
	{
		heapSort(arr, arr.length);
	}
	
	private static <T extends Comparable<T>> int partition(T[] arr, int p, int r) {
		T x = arr[r];
		int i = p - 1;
		
		for(int j = p; j < r; j++)
		{
			if(arr[j].compareTo(x) <= 0)
			{
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,r);
		return i+1;
	}
	
	public static <T extends Comparable<T>> void quickSort(T[] arr, int p, int r) {
		if(p < r) {
			int q = partition(arr, p, r);
			quickSort(arr, p, q-1);
			quickSort(arr, q + 1, r);
		}
	}
	
	public static <T extends Comparable<T>> void quickSort(T[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	
	

	public static <T extends Comparable<T>> void shellSort (T arr[]) {	
		
		for (int step = arr.length / 2; step > 0; step /= 2) {
			for (int i = step; i < arr.length; i++) {
				for (int j = i - step; j >= 0 && arr[j].compareTo(arr[j + step]) > 0; j -= step) {
					swap(arr, j, j+step);
				}
			}
		}
		
	}
	
	
}
