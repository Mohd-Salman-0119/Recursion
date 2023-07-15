package Recursion;

import java.util.Scanner;

public class SuperDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String number = "";
            number = getStringNumber(n, k, number);

            //
            int nums = Integer.parseInt(number);
            System.out.println(getOneDigit(nums));
        }
    }

    static String getSuperDigit(String str, int i) {
        if (i == str.length()) {
            return "";
        }
        return (Character.getNumericValue(str.charAt(i)) + getSuperDigit(str, i + 1)) + "";
    }

    static String getStringNumber(int n, int k, String str) {
        if (k == 0) {
            return "";
        }
        str += n + getStringNumber(n, k - 1, str);
        return str;
    }

    static String getOneDigit(int num) {
        if (num >= 9) {
            return "";
        }
        String ans = getSuperDigit(num + "", 0);
        return ans;
    }
}
