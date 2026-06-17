package day7;

public class Array {
    static void main(String[] args) {
//        String[] students = {"eslam","fanta","ahmed","eman","basmala"};
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i]);
//        }
//        System.out.println("**************************");
//        students[2] = "ali";
//        System.out.println(students[2]);
//        System.out.println("**********************");
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i]);
//        }
//        System.out.println("***********************");
//       System.out.println(students[10]);
//        LinearSearch linearSearch = new LinearSearch();
//        linearSearch.search();

//        countWords("hello eslam your name is fanta");
        reverseWords("Hello World");
    }
    public static void countWords(String text)
        {
        String[] words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("your test contains %d words", numberOfWords);
        System.out.println(message);

            for (int i = 0; i < numberOfWords; i++)
            {
                System.out.println(words[i]);
            }
        }
        private static void reverseWords(String text)
        {
            String result = "";
            for (int i = text.length() - 1; i >= 0; i--)
            {
                result += text.charAt(i);
            }
            System.out.println(result);
        }




}
