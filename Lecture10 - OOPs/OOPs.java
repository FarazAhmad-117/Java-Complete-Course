



public class OOPs {
    public static void main(String[] args) {
        Pen p= new Pen();
        p.color = "red";
        p.type = "ballpen";
        p.display();
    }

    /*
     * This  is 
     * also 
     * a comment!
     */
}



class Pen{
    String color;
    String type;

    public void display(){
        System.out.println("Hello here is data -->> "+this.color+" and "+this.type);
    }

}