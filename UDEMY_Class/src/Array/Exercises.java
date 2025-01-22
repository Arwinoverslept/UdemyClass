package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercises {
	 public static void main(String[] args) {

	        List<Integer> numbers = new ArrayList<>();


	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);

	        System.out.println("Original List: " + numbers);

	        numbers.remove(2);

	        System.out.println("After removing element at index 2: " + numbers);

	        numbers.add(2, 25);

	        System.out.println("After adding 25 at index 2: " + numbers);

	        int max = Collections.max(numbers);
	        System.out.println("Maximum value in the list: " + max);

	        int sum = 0;
	        for (int number : numbers) {
	            sum += number;
	        }
	        System.out.println("Sum of all values in the list: " + sum);
	    }
}


