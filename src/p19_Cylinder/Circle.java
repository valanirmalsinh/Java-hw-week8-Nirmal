package p19_Cylinder;

public class Circle {
    double radius;

    public Circle(double radius) {
        if(radius<0){
            this.radius=0;
        }else{
            this.radius = radius;
        }
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        double area=Math.PI*radius*radius;
        return area;
    }
}