import java.util.*; 
public class TcsMock_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        long[] arr = new long[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        long result = findPrimeWithRemainder(arr);
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("None");
        }
    }

    public static long findPrimeWithRemainder(long[] arr) {
        long prod = 1;
        for (int i = 1; i < arr.length; i++) {
            prod *= arr[i];
        }

        for (long i = arr[0] + 1; ; i++) {
            boolean flag = true;
            for (int j = 1; j < arr.length; j++) {
                if (i % arr[j] != arr[0]) {
                    flag = false;
                    break;
                }
            }
            if (flag && isPrime(i)) {
                return i;
            }
            if (i > prod) {
                break;
            }
        }
        return -1;
    }

    public static boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (long i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
