import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan yang ingin diperiksa: ");
        String input = scanner.nextLine();
        checkPattern(input);
    }
    public static boolean checkPattern(String input) {
        String email = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        String date1 = "\\d{2}-\\d{2}-\\d{4}";
        String date2 = "\\p{L}{4,10},\\s\\p{L}{4,10}\\s\\d{2}";
        String ipAddress = "^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$";

        boolean isEmail = Pattern.matches(email, input);
        boolean isDate1 = Pattern.matches(date1, input);
        boolean isDate2 = Pattern.matches(date2, input);
        boolean isIPAddress = Pattern.matches(ipAddress, input);

        if (isEmail) {
            System.out.println("Ini adalah email");
            return true;
        } else if (isDate1 || isDate2) {
            System.out.println("Ini adalah date");
            return true;
        } else if (isIPAddress) {
            System.out.println("Ini adalah  IpAddress");
            return true;
        } else {
            System.err.println("Tidak ada yang sesuai");
            return false;
        }
    }
}