package in.nuron;

import java.util.SortedMap;

public class CompareStr {
    public static void main(String[] args) {
        String s1 = new String("Ronnie");
        String s2  = new String("Ronnie");

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode()+" and " + s2.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1.compareTo(s2));

        System.out.println("*****************************");

        StringBuilder s3 = new StringBuilder("Ronnie");
        StringBuilder s4 = new StringBuilder("Ronnie");

        System.out.println(s3.equals(s4));
        System.out.println(s3.hashCode()+" and " + s4.hashCode());
        System.out.println(s3==s4);
        System.out.println(s3.compareTo(s4));

        System.out.println("*****************************");

        StringBuffer s5 = new StringBuffer("Ronnie");
        StringBuffer s6 = new StringBuffer("Ronnie");

        System.out.println(s5.equals(s6));
        System.out.println(s5.hashCode()+" and " + s6.hashCode());
        System.out.println(s5==s6);
        System.out.println(s5.compareTo(s6));
    }
}
