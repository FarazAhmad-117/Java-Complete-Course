import java.util.Scanner;



public class Input {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name:");
        // String name = sc.next();
        // System.out.println("Hello "+name);
        // sc.close();

        //Done
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name again:");
        // String name = sc.nextLine();
        // System.out.println("Hello "+name);
        // sc.close();

        // A Challenge
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int a = sc.nextInt();
        System.out.print("Enter another number");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(String.format("The sum is ==>> %d", sum));
        sc.close();
    }
}
