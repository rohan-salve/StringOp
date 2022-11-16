package in.nuron;

import java.util.Scanner;

import static java.lang.Boolean.TRUE;

public class CheckPalindrome {
    private static String getStr()
    {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
    private static String copyStr(String str1)
    {
        String str2 = "";
        for (int i = str1.length()-1; i>=0;i--)
        {
            str2+=str1.charAt(i);
        }
        return str2;
    }

    private static void isPalindrome(String str1 , String str2)
    {
        if(str1.equals(str2))
        {
            System.out.println("Palindrome");
        }
        else System.out.println("NOT Palindrome");
    }
    public static void main(String[] args) {
        String s1 = getStr();

        String s2 = copyStr(s1);

        isPalindrome(s1,s2);

    }

}
