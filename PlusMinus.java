import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberOfElement = scanner.nextLine(); //actually this scanner is not needed
        String inputString = scanner.nextLine();
        String[] strings = inputString.split(" ");
        int[] arr = new int[strings.length];
        for (int i = 0;i<arr.length;i++) {
            arr[i]=Integer.parseInt(strings[i]);
        }
        scanner.close();
        plusMinus(arr);
    }

    private static void plusMinus(int[] arr) {
        int numberOfElement = arr.length;
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        for (int element: arr) {
            if (element>0) {
                countPositive++;
            } else if (element<0) {
                countNegative++;
            } else {
                countZero++;
            }
        }
        System.out.println(String.format("%.6f", ((float)countPositive)/numberOfElement));
        System.out.println(String.format("%.6f", ((float)countNegative)/numberOfElement));
        System.out.println(String.format("%.6f", ((float)countZero)/numberOfElement));
    }
}
