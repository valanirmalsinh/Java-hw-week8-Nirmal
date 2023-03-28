package p17_carpetCostCalculator;

public class Floor {
    double width,length;

    public Floor(double width, double length){
        this.width=width;
        this.length=length;
        if (width<0){
            this.width=0;
        }
        if(length<0){
            this.length=0;
        }
    }
    public double getArea(){
        double area = width*length;
        return area;
    }
}
