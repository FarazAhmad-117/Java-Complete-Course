import java.util.*;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a the count down number:");
        int number = sc.nextInt();
        sc.close();
        while (number > 0) {
            System.out.println(number);
            number--;
        }
        System.out.println("End of Program!");
    }
}
