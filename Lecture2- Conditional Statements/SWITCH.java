import java.util.*;


public class SWITCH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("You entered 1");
                break;
            case 2:
                System.out.println("You entered 2");
                System.out.println("Not a great option!");
                break;
            case 3:{
                System.out.println("You entered 3");
                System.out.println("A great option!");
                break;
            }
            case 4:
                System.out.println("You entered 4");
                break;
            default:
                System.out.println("Out of range number entered!");
                break;
        }
        sc.close();
    }
}
