package day7;

public class TextProcess {

    public static void main(String[] args) {

        String s = "Hello big boy!";

        System.out.println(s);
        System.out.println(s.length());       // String.length()
        System.out.println(s.toLowerCase());  // String.toLowerCase()
        System.out.println(s.toUpperCase());  // String.toUpperCase()
        System.out.println(s.charAt(3));      // String.charAt()

        // reference point object
        String a = "Islam";
        String b = "Islam";

        System.out.println(a == b);

        String c = new String("Islam"); // new object in HEAP

        System.out.println(a == c);

        System.out.println(a.equals(c)); // compare values

        String text = "I love JAVA, java is fun.";

        String lower = text.toLowerCase();
        System.out.println(lower);

        String upper = text.toUpperCase();
        System.out.println(upper);

        System.out.println(text.indexOf('a'));      // first occurrence
        System.out.println(text.lastIndexOf('a'));  // last occurrence

    }
}