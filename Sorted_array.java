package pbl_wipro;
import java.util.*;
public class Sorted_array {

	public static void main(String[] args) {
		int[] arr = {45, 12, 78, 34, 23, 9};

        Arrays.sort(arr);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}