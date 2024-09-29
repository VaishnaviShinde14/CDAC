public class ReverseArray {
    public static void main(String[] args) {
		int[] arr1 = {1'2'3'4};
		int[] arr1 = {7,8,9};		
        System.out.println("Original Array 1: ");
        printArray(arr1);
		reverseArray(arr1);
        System.out.println("ReversedArray 1: ");  
        printArray(arr1);
		  System.out.println("Original Array 2: ");
        printArray(arr2);
		reverseArray(arr2);
        System.out.println("ReversedArray 2: ");  
        printArray(arr2);
    }
    public static void reverseArray(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
    public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
			System.out.println();
	}
}	

	