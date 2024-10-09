package a2;
import java.util.*;
public class Q2_Removing_Array_Duplicates {

	public static void main(String[] args) {
		
		
		//for hard coded values 
//		int arr[] = {0, 0, 1, 1, 2, 2, 3, 3};
//		
//		int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};
//	     int n = arr.length;
//	     Set hash_Set = new HashSet();
//	     for (int i=0; i<n; i++) {
//	       hash_Set.add(arr[i]);
//	     }
//	     System.out.print(hash_Set);
//		--------------------------------------

		//for user define values 
		Scanner sc =new Scanner(System.in);

		System.out.print("Enter size of Array:  ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.print("Enter the array Elements:  ");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println();
		
		System.out.print("Inserted elements are: ");
		for(int i=0; i<n; i++) {
			System.out.print (arr[i]+" ") ;
		}
		System.out.println();

		Set set = new HashSet();
		for(int ele:arr) {
			set.add(ele);
		}
		System.out.println("Unique:  "+set);
		
		
//		new approch
//		  static int removeDuplicates(int arr[], int n)
//		   {
//		      if (n==0 || n==1)
//		         return n;
//		int j = 0;
//		for (int i=0; i<n-1; i++)
//		if (arr[i] != arr[i+1])
//		arr[j++] = arr[i];
//		arr[j++] = arr[n-1];
//
//		return j;
//		}

		
		
	}

}
