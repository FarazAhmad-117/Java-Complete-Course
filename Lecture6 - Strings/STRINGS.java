// import java.util.Scanner;

public class STRINGS {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a string:");
        // String str = sc.nextLine();
        // sc.close();
        String str= "Altaf";
        System.out.println(str);

        System.out.println(str.length());

        String str1 = "Ali";
        String str2 = "Ali";
        if(str1 == str2){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not Equal");
        }

        if(new String("Ali") == new String("Ali")){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not Equal");
        }

        int num = Integer.valueOf("123");
        System.out.println(num);

    }
}
