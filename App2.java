public class App2 {
    public static void main(String[] args) throws Exception {
        int[] arr = {64, 34, 25, 12, 22, 11, 90}; 
        System.out.println("1. bubbleSort");
        bubbleSort(arr, true); // Ascending order
        System.out.println("Array setelah diurutkan secara ascending:");
        printArray(arr);
        bubbleSort(arr, false); // Descending order
        System.out.println("Array setelah diurutkan secara descending:");
        printArray(arr);
        
        int[] arr2 = {64, 34, 25, 12, 22, 11, 98};
        System.out.println("2. insertionSort");
        insertionSort(arr2, true); // Ascending order
        System.out.println("Array 2 setelah diurutkan secara ascending:");
        printArray(arr2);
        insertionSort(arr2, false); // Descending order
        System.out.println("Array 2 setelah diurutkan secara descending:");
        printArray(arr2);
        
        int[] arr3 = {64, 34, 25, 12, 22, 188, 98};
        System.out.println("3. selectionSortSort");
        selectionSort(arr3, true); // Ascending order
        System.out.println("Array 3 setelah diurutkan secara ascending:");
        printArray(arr3);
        selectionSort(arr3, false); // Descending order
        System.out.println("Array 3 setelah diurutkan secara descending:");
        printArray(arr3);
    }
        
    public static void insertionSort(int[] arr, boolean ascending) {
        int n = arr.length; 
        for (int i = 1; i < n; i++) {
            int key = arr[i]; 
            int j = i - 1; 
            if (ascending) {
                while (j >= 0 && arr[j] > key) { 
                    arr[j + 1] = arr[j]; 
                    j--;
                }
            } else {
                while (j >= 0 && arr[j] < key) { 
                    arr[j + 1] = arr[j]; 
                    j--;
                }
            }
            arr[j + 1] = key;
        }
    }
    
    public static void selectionSort(int arr[], boolean ascending) {
        int pos;
        int temp; 
        for (int i = 0; i < arr.length; i++) {
            pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (ascending) {
                    if (arr[j] < arr[pos]) {
                        pos = j;
                    }
                } else {
                    if (arr[j] > arr[pos]) {
                        pos = j;
                    }
                }
            }
            temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void bubbleSort(int[] arr, boolean ascending) {
        int n = arr.length; 
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) { 
                if (ascending) {
                    if (arr[j] > arr[j + 1]) { 
                        int temp = arr[j]; 
                        arr[j] = arr[j + 1]; 
                        arr[j + 1] = temp;
                    }
                } else {
                    if (arr[j] < arr[j + 1]) { 
                        int temp = arr[j]; 
                        arr[j] = arr[j + 1]; 
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }
    
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        } 
        System.out.println();
    }
}