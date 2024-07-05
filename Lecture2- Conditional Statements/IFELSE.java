import java.util.*;


public abstract class IFELSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age < 18){
            System.out.println("I am sorry you are underage! Come again when you are adult!");
        }else{
            System.out.println("Wellcome to the club!");
        }
        sc.close();
    }
}
