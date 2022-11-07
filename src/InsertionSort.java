public class InsertionSort {

    public static void main(String[] args) {
        int[] array = insertionSort(new int[] {100, 3, -1, -20, 12, 6, -42, 70});
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    // insertion sort algorithm
    public static int[] insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {

            int element = array[i];
            int j = i-1;
            while (j >= 0 && array[j] > element){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = element;

        }

        return array;
    }

}
