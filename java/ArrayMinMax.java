import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {
    static void getMinMax(long a[], long n) {
        long maxNo = Long.MIN_VALUE; // Use Long.MIN_VALUE for long data type
        long minNo = Long.MAX_VALUE;  // Use Long.MAX_VALUE for long data type
        
        // Finding the minimum and maximum numbers
        for (int i = 0; i < n; i++) {
            if (a[i] > maxNo) {
                maxNo = a[i];
            }
            if (a[i] < minNo) {
                minNo = a[i];
            }
        }
        System.out.println("min = " + minNo);
        System.out.println("max = " + maxNo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        long a[] = new long[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong(); // Use nextLong() for long inputs
        }

        getMinMax(a, n);
        Arrays.sort(a);

        // Check if there are at least 4 elements before accessing index 3
        if (n >= 4) {
            System.out.println("The fourth smallest element is: " + a[3]);
        } else {
            System.out.println("Not enough elements to display the fourth smallest element.");
        }

        sc.close(); // Close the Scanner
    }
}


