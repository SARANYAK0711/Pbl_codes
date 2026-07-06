package pbl_wipro;
import java.util.*;
public class Find_largestsmallest {

	public static void main(String[] args) {
		int[] arr = {12, 45, 7, 89, 23, 56};

        Arrays.sort(arr);

        System.out.println("Smallest 2 numbers: " + arr[0] + " " + arr[1]);
        System.out.println("Largest 2 numbers: " + arr[arr.length - 2] + " " + arr[arr.length - 1]);

    }

}