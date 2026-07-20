package pbl_wipro;
import java.util.*;
public class Middleway {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        int[] a = new int[3];
		        int[] b = new int[3];
		        int[] result = new int[2];

		        System.out.println("Enter 3 elements of first array:");
		        for (int i = 0; i < 3; i++) {
		            a[i] = sc.nextInt();
		        }

		        System.out.println("Enter 3 elements of second array:");
		        for (int i = 0; i < 3; i++) {
		            b[i] = sc.nextInt();
		        }

		        result[0] = a[1];
		        result[1] = b[1];

		        System.out.print("Output: [");
		        System.out.print(result[0] + ", " + result[1]);
		        System.out.println("]");

		        sc.close();
		    }
		}