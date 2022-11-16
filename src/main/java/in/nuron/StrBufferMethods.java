package in.nuron;

public class StrBufferMethods {


    public static void main(String[] args) {

        System.out.println("*******Buffer*******");
        StringBuffer s1 = new StringBuffer();
        System.out.println("Default capacity ==> "+s1.capacity());
        s1.append(10);
        System.out.println(s1);
        System.out.println(s1.capacity());
        s1.append('L');
        System.out.println(s1);
        s1.append("eonelMessiFromBarcaIsHere");
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.capacity());

        System.out.println("*******Builder***********");

        StringBuilder s4 = new StringBuilder();
        System.out.println(s4);
        System.out.println("Default Capacity String Builder ==> "+s4.capacity());
        s4.append(10);
        System.out.println(s4);
        System.out.println(s4.capacity());
        s4.append('L');
        System.out.println(s4);
        s4.append("eonelMessiFromBarcaIsHere");
        System.out.println(s4);
        System.out.println(s4.length());
        System.out.println(s4.capacity());

        System.out.println("*******Buffer*******");
        System.out.println(s1.charAt(2));
        s1.delete(13,s1.length());
        System.out.println(s1);
        s1.deleteCharAt(0);
        System.out.println(s1);
        s1.ensureCapacity(10);
        System.out.println(s1.indexOf("e"));
        s1.deleteCharAt(0);
        System.out.println(s1.compareTo(new StringBuffer("LeonelMessi")));
        String s2 = new String("Messi");
        String s3 = "Leonel";
        System.out.println(s1.lastIndexOf(s2));
        System.out.println(s1.lastIndexOf(s3));
        s1.replace(3,s1.length(),"nardoDeCaprio");
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1.substring(8));
        System.out.println(s1.toString());
        System.out.println(s1.capacity());
        s1.trimToSize();
        System.out.println(s1.capacity());
        System.out.println(s1.isEmpty());
        System.out.println(s1.getClass());
        s1.setLength(8);
        System.out.println(s1);

    }

}
