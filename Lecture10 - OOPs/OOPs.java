import bank.Account;



public class OOPs {
    public static void main(String[] args) {
        // Pen p= new Pen();
        // p.color = "red";
        // p.type = "ballpen";
        // p.display();

        // Human h1 = new Human("Faraz Ahmad", 18);
        // h1.displayInfo();
        // // Human h2 = h1; // Same info not created another string
        // // h2.displayInfo();
        // Human h2 = new Human(h1); // Created anohter string in memory
        // h1.name = "Altaf";
        // h2.displayInfo();

        // Learning Polymorphism
        // ShapeConstructor sc = new ShapeConstructor();
        // sc.printShape();
        // sc.printShape(23);
        // sc.printShape("Hello");

        // Account a = new Account("Faraz");
        // a.printInfo();

        // Horse h = new Horse();
        // h.walk();
        // h.eats();

    }

    /*
     * This  is 
     * also 
     * a comment!
     */
}

// Abstraction

// abstract class Animal {
//     abstract void walk();
//     public void eats(){
//         System.out.println("It eats");
//     }
// }


// class Horse extends Animal{
//     public void walk(){
//         System.out.println("Horse walks on 4 legs");
//     }
// }

// class Hen extends Animal {
//     public void walk(){
//         System.out.println("Hen walks on 2 legs");
//     }
// }



class Pen{
    String color;
    String type;

    public void display(){
        System.out.println("Hello here is data -->> "+this.color+" and "+this.type);
    }

}


// Constructors

class Human {
    String name;
    int age;

    Human(String str,int a){
        this.name = str;
        this.age = a;
    }

    Human(Human h){
        this.name = h.name;
        this.age = h.age;
    }

    void getAge(int a){
        this.age = a;
    }

    void getName(String str){
        this.name = str;
    }

    void displayInfo(){
        System.out.println("Name = "+this.name+" Age = "+String.valueOf(this.age));
    }

}



// Polymorphisim

// Functon Overloading

class ShapeConstructor{

    public void printShape(){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }


    public void printShape(String str){
        for(int i=0;i<9;i++){
            for(int j=0;j<4;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }


    public void printShape(int a){
        for(int i=0;i<4;i++){
            for(int j=0;j<9;j++){ 
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    
}





// Pure Abstraction -- Interfaces;


/**
 * Animal
 */
interface Animal {
    public void walk();
}

interface Herbivour{

}

class Horse implements Animal, Herbivour{
    public void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}




















