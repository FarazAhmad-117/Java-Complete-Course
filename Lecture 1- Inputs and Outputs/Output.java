

public class Output {

    public static void printPatern(int number){
        for(int i=0;i<number;i++){
            for(int j=i;j>=0;j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] argv){
        System.out.print("Hello");
        System.out.print("World\n");
        System.out.println("Hello");
        System.out.println("World");
        printPatern(5);
    }

}
