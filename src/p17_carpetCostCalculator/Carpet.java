package p17_carpetCostCalculator;

public class Carpet {
    double cost;
    public Carpet(double cost){
        this.cost=cost;
        if(cost<0){
            cost=0;
        }
    }
    public double getCost(){
        return cost;
    }
}
