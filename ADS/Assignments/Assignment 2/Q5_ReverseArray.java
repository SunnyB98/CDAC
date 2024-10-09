package a2;

import java.util.Scanner;

public class Q5_ReverseArray {
	
	static void reverseRecursion(int arr[], int start, int end){
		
		if(start>=end) {
			return;
		}
		int temp = arr[start];
		arr[start] =arr[end];
		arr[end] =temp;
		reverseRecursion(arr, start+1, end-1);
	}
	
	
	public static void main(String[] args) {
		
//		int arr[] = {1,2,3,4,5};
//		int n =arr.length;
//		for(int i=n-1; i>=0; i--) {               //time-O(n)  space- O(1)
//			System.out.println(arr[i]+" ");
//		}
		
		//recursion
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		int start=0, end=n-1;
		reverseRecursion(arr, start, end);
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");		
	    }
	
	}
}
