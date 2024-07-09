import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        do{
            System.out.println("Number is "+number);
            number--;
        }while(number > 0);
    }
}



