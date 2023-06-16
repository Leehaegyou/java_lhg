package day13.sort;

import array.Array;

public class ArraySortEx {

	public static void main(String[] args) {
		//버블 정렬 예제
		int arr[] = {1, 4, 7, 9, 2, 8, 3, 6};
		
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = 0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			Array.printArray(arr);
		}
	}

}