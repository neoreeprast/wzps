import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String result = timeConversion(inputString);
        System.out.println(result);
        scanner.close();
    }

    private static String timeConversion(String s) {
        StringBuilder sb = new StringBuilder();
        String timeMark = s.substring(8);
        String timeNumber = s.substring(0, 8);
        String[] timeParts = timeNumber.split(":");
        int hour = Integer.parseInt(timeParts[0]);
        if ("AM".equals(timeMark) && hour == 12) {
            hour = 0;
        } else if ("PM".equals(timeMark) && hour != 12) {
            hour = hour + 12;
        }
        sb.append(String.format("%02d", hour))
        .append(':').append(timeParts[1]).append(':').append(timeParts[2]);
        return sb.toString();
    }
}
