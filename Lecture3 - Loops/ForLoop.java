import java.util.*;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int number = sc.nextInt();
        for(int i=0;i<10;i++){
            System.out.println(number + " x " + (i+1) + " = " + (number*(i+1)));
        }
        sc.close();
    }
}
