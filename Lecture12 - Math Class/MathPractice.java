import java.util.Scanner;

public class MathPractice {
    public static void main(String[] args) {
        // Program to find the area of hypotenous;
        // double x = 3.14;
        // double y = -10;
        // double z = Math.max(x,y);
        // double w = Math.min(x, y);
        // System.out.println(z);
        // System.out.println(w);
        // System.out.println(Math.abs(y));
        // System.out.println(Math.sqrt(16));
        // System.out.println(Math.round(x));
        // System.out.println(Math.ceil(x));
        // System.out.println(Math.floor(3.88));


        // Program to find the hypotenous of a triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of base x :");
        double x = sc.nextDouble();
        System.out.println("Enter value of perpendicular y :");
        double y = sc.nextDouble();

        double z = Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));
        System.out.println("The hypotenous is "+String.valueOf(z));
        sc.close();
    }
}
