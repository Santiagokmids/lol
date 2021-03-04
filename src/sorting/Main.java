package sorting;

import java.util.Arrays;

public class Main {
	
	public static int array[];
	
	/*public static void bubbleSort(){
		for(int i=1;i<array.length;i++) {
			
			for(int j=0;j<array.length-i;j++) {
			
				if(array[j] > array[j+1]) {
					int tem = array[j];
					array[j] = array[j+1];
					array[j+1] = tem;
				}
			}
		}
		System.out.println(Arrays.toString(array));	
	}
	
	public static void main(String[] args) {
		array = new int[] {3,1,8,5,9,4,2,6,7};
		System.out.println(Arrays.toString(array));
		
		bubbleSort();
		
	}*/
	
	/*public static void selectionSort() {
		for(int i=0;i<array.length;i++) {
			int min = array[i];
			for(int j = i+1;j < array.length;j++) {
				if(array[j]<min) {
					int temp = array[j];
					array[j] = min;
					min = temp;
				}
			}
			array[i] = min;
		}
		System.out.println(Arrays.toString(array));
	}*/
	
	/*public static void main(String[] args) {
		array = new int[] {3,1,8,5,9,4,2,6,7};
		System.out.println(Arrays.toString(array));
		
		selectionSort();
	}**/
	
	public static void insertionSort() {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0 && array[j-1]>array[j]; j--) {
				int temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;	
			}
		}
	}
	
	public static void main(String[] args) {
		array = new int[] {3,1,8,5,9,4,2,6,7};
		System.out.println(Arrays.toString(array));
		
		insertionSort();
		System.out.println(Arrays.toString(array));
	}
	
}
