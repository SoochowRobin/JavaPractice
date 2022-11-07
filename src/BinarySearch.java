public class BinarySearch {

    /*
    review binary search method
    return -1 if not find, and return index of target element
     */
    public static int binarySearch(int[] a, int k){
        int left = 0;
        int right = a.length - 1; // right index

        while (left <= right){
            int mid = left + (right - left) / 2;
            if (k < a[mid]){
                right = mid - 1;
            }else if (k > a[mid]){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 9; // change target value here
        int result = binarySearch(array, target);
        if (result != -1){
            System.out.println("The index of the target element is " + result);
        }else{
            System.out.println("The target element is not in the array!");
        }
    }

}
