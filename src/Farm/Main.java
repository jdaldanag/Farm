package Farm;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Farm farm = new Farm("Esko", new Barn(new BulkTank()));
        MilkingRobot robot = new MilkingRobot();
        farm.installRobot(robot);

farm.addCow(new Cow());
farm.addCow(new Cow());
farm.addCow(new Cow());


farm.liveHour();
farm.liveHour();

farm.manageCows();

System.out.println(farm);
    }
    
}