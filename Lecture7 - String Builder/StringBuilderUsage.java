import java.util.*;


public class StringBuilderUsage {
    public static void main(String[] args) {
        // Java strings are immutable that means strings are created new even if a one word is changed a new string is made!
        // In this case string builder is used
        // String builder creates string in heap
        // StringBuilder sb = new StringBuilder("Faraz"); // here sb is a string of type string builder
        // System.out.println(sb.charAt(0));
        // sb.insert(3, 'R');
        // sb.setCharAt(2, 'A');

        // sb.insert(0,'S');
        // sb.insert(1,'a');
        // sb.insert(2,'r');

        // sb.delete(2, 4);

        // sb.append(" !");
        // System.out.println(sb.length());
        // System.out.println(sb);

        // Reverse a string;
        String str = "Hello How are you?";
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            sb.insert(0, str.charAt(i));
        }
        System.out.println(sb);
    }
}
