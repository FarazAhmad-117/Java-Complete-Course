import java.util.*;


public abstract class IFELSE {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your age: ");
        // int age = sc.nextInt();
        // if(age < 18){
        //     System.out.println("I am sorry you are underage! Come again when you are adult!");
        // }else{
        //     System.out.println("Wellcome to the club!");
        // }
        // sc.close();


        ////////////////////////////////////////////////////////////

        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();
        // if(n%2 == 0){
        //     System.out.println("Even");
        // }else{
        //     System.out.println("Odd");
        // }
        // sc.close();


        ////////////////////////////////////////////////////////////


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        if(a == b){
            System.out.println("Equal");
        }else if(a > b){
            System.out.println("First is greater");
        }else{
            System.out.println("Second is greater");
        }
        sc.close();
    }
}
