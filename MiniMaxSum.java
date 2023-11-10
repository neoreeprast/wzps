import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        String inputString = scanner.nextLine();
        String[] strings = inputString.split(" ");
        int[] arr = new int[strings.length];
        for (int i = 0;i<arr.length;i++) {
            arr[i]=Integer.parseInt(strings[i]);
        }
        scanner.close();
        miniMaxSum(arr);
    }

    /**
     * print min and max value of the given array by add 4 of 5 integer
     * @param arr
     */
    private static void miniMaxSum(int[] arr) {
        /*
         * since the number of array element is fixed to 5,
         * to get minimum and maximum, we can sort the integers and then sum the first 4 element to get minimum
         * and sum the last 4 element to get the maximum value
         */
        Arrays.sort(arr);
        int min = arr[0] + arr[1] + arr[2] + arr[3];
        int max = arr[1] + arr[2] + arr[3] + arr[4];
        System.out.println(min + " " + max);
    }
}