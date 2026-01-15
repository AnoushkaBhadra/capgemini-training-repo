package assignments;

public class IsPalindrome {
    public static void main(String args[]) {
        String s = "MadaM";

        if (Palindrome(s)) {
            System.out.println("It is a Palindrome String");
        } else {
            System.out.println("It is not a Palindrome String");
        }
    }

    public static boolean Palindrome(String s) {
        String temp = s.toLowerCase();
        String rev = "";

        for (int i = temp.length() - 1; i >= 0; i--) {
            rev = rev + temp.charAt(i);
        }

        return temp.equals(rev);
    }
}
