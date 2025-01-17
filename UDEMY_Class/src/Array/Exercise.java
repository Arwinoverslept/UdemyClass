package Array;

public class Exercise {
	
    public static void main(String[] args) {
        
        int[] array = {12, 13, 11, 15, 16, 7, 9, 90, 9, 4};

       
        System.out.println("Original Array:");
        printArray(array);

       
        reverseArray(array);
        System.out.println("Reversed Array:");
        printArray(array);

        
        int max = findMaximum(array);
        int min = findMinimum(array);
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

     
        int sum = calculateSum(array);
        double average = calculateAverage(array);
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);

       
        int searchElement = 15;
        int index = searchElement(array, searchElement);
        if (index != -1) {
            System.out.println("Element " + searchElement + " found at index: " + index);
        } else {
            System.out.println("Element " + searchElement + " not found.");
        }

        sortArray(array);
        System.out.println("Sorted Array:");
        printArray(array);
    }

    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            
            start++;
            end--;
        }
    }

    
    public static int findMaximum(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static int findMinimum(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

   
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    
    public static double calculateAverage(int[] array) {
        int sum = calculateSum(array);
        return (double) sum / array.length;
    }

   
    public static int searchElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i; 
            }
        }
        return -1; 
    }

    
    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    // Swap elements
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

