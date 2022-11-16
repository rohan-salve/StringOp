package in.nuron;

public class MutableOp {
    public static void main(String[] args) {

        String s1 = new String("John");
        String s2 = new String(" Wick");

        s1.concat(s2); // Results wont be happen in s1 as it is immutable, rather the operation will create new object in HEAP area with results.
        System.out.println(s1);// results wont be shown as result is not stored in s1

        String s3 = s1.concat(s2); // concat op done and results saved in s3
        System.out.println(s3);

        StringBuffer s4 = new StringBuffer("Iron");
        s4.append("Man");
        System.out.println(s4+"  via StringBuffer");

        StringBuilder s5 = new StringBuilder("Spider");
        s5.append("Man");
        System.out.println(s5+" via StringBuilder");

        StringBuffer s6 = new StringBuffer("Super");
        String s7 = new String("Man");

        s6.append(s7);
        System.out.println(s6);

        StringBuffer s8 = new StringBuffer("Amazing ");
        s8.append(s5);
        System.out.println(s8);

        StringBuilder s9 = new StringBuilder(" Homecoming");
        s5.append(s9);
        System.out.println(s5);



    }
}