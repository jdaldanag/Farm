package Farm;
import java.util.ArrayList;

public class Barn {
    private BulkTank tank;
    private MilkingRobot robot;
    
    public Barn(BulkTank tank){
        this.tank = tank; }
    
    public BulkTank getBulkTank(){
        return this.tank; }
    
    public void installRobot(MilkingRobot robot){
        this.robot = robot;
        robot.setBulkTank(tank);}
    
    public void takeCare(Cow cow){
        robot.milk(cow); }
    
    public void takeCare(ArrayList<Cow> cows){
        for(Cow x : cows){
            robot.milk(x); } }
    
    public String toString(){
        return tank.toString();
    }
    
}
