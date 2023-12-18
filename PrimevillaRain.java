import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class PrimevillaRain {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int getNextPrime(int n) {
        while (true) {
            n++;
            if (isPrime(n)) {
                return n;
            }
        }
    }

    public static String checkRain(String dateStr, String weekday, int n) {
        int day = Integer.parseInt(dateStr.substring(6));
        int month = Integer.parseInt(dateStr.substring(4, 6));
        int year = Integer.parseInt(dateStr.substring(0, 4));
        LocalDate currentDate = LocalDate.of(year, month, day);
        int count = 0;
        while (count < n) {
            currentDate = currentDate.plusDays(1);
            count++;
            if (currentDate.getDayOfWeek() == DayOfWeek.valueOf(weekday.toUpperCase()) &&
                    isPrime(currentDate.getDayOfYear()) && (month == 2 || month == 3 || month == 5 || month == 7 || month == 11)) {
                if (count <= n) {
                    return "Yes " + count;
                } else {
                    return "No " + count;
                }
            }
        }
        return "No " + getNextPrime(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        String date = parts[0];
        String weekday = parts[1];
        int n = Integer.parseInt(parts[2]);
        String output = checkRain(date, weekday, n);
        System.out.println(output);
        scanner.close();
    }
}
