package Farm;
import java.util.ArrayList;

public class Farm implements Alive{
    private String owner;
    private Barn barn;
    private ArrayList<Cow> cows = new ArrayList<Cow>();
    
    public Farm(String owner,Barn barn){
        this.owner = owner;
        this.barn = barn; }
    
    public void liveHour(){
        for(Cow x : cows){
            x.liveHour(); } }
    
    public void manageCows(){
    barn.takeCare(cows); }
    
    public String getOwner(){
        return this.owner;}
    
    public String getCows(){
        if(cows.isEmpty()){
            return "No cows"; }
        else{
            System.out.println("Animals: ");
            for(Cow x : cows){
                System.out.println(x.toString()); } }
        return "";}
    
    public void addCow(Cow cow){
        cows.add(cow); }
    
    public String toString(){
        return "Farm Owner: " + this.owner + "\n" + barn.toString() + "\n" + this.getCows();}
    
    public void installRobot(MilkingRobot robot){
        this.barn.installRobot(robot); }
}
