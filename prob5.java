package methodsheet;

import java.util.Scanner;

public class prob5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        valid_password(s);
    }

    public static void valid_password(String s) {
        if (s.length() >= 10) {
            if (countDigit(s) >= 2 && contain_Char_Or_Digit(s)) {
                System.out.println("password is valid");
            } else {
                System.out.println("password is not valid");
            }
        }
    }

    public static int countDigit(String s) {
        int digitCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                digitCount++;
            }
        }
        return digitCount;
    }

    public static boolean contain_Char_Or_Digit(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
