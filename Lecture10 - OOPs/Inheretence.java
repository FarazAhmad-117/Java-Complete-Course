public class Inheretence {
    public static void main(String[] args) {
        System.out.println("Hello Inheritance!");
        TriangleMaker t = new TriangleMaker("red", 3, 5);
        t.draw();
    }
}


class Shape{
    String color;

    Shape(String clr){
        this.color = clr;
    }
}

class Triangle extends Shape{
    int height;
    int base;

    Triangle(String clr,int h, int b){
        super(clr);
        this.height = h;
        this.base = b;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

}


interface ShapeMaker {
    void draw();
}


class TriangleMaker extends Triangle implements ShapeMaker {
    TriangleMaker(String clr,int h,int b){
        super(clr,h,b);
    }

    @Override
    public void draw(){
        System.out.println("Drawing a triangle with color: " + color + ", base: " + base + ", height: " + height + ", area: " + getArea());
    }
}


