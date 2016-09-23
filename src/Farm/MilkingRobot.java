package Farm;

public class MilkingRobot {
    private BulkTank tank;
    
    public MilkingRobot(){  }
    
    public BulkTank getBulkTank(){
        return this.tank; }
    
    public void setBulkTank(BulkTank tank){
        this.tank = tank; }
    
    public void milk(Milkable animal){
        double x = animal.milk();
        this.tank.fillTank(x); }
    
    
    
}
