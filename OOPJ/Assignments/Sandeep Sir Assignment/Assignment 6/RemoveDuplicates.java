import java.util.Arrays;
public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] array) {
        Arrays.sort(array);
        if (array.length <= 1) {
            return array;
        }
        int[] temp = new int[array.length];
        int j = 0; 
        temp[j++] = array[0];    
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                temp[j++] = array[i];
            }
        }
        int[] result = new int[j];
        System.arraycopy(temp, 0, result, 0, j);   
        return result;
    }
    public static void main(String[] args) {   
        int[] arr = {1, 2, 3, 4, 2, 6, 7, 5, 8, 3, 6, 10};
        System.out.println("Original Array: " + Arrays.toString(arr));
        int[] uniqArr = removeDuplicates(arr);
        System.out.println("Array After Removing Duplicates: " + Arrays.toString(uniqArr));
    }
}
