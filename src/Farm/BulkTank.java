package Farm;
import java.math.*;

public class BulkTank {
    private double capacity;
    private double volume = 0;
    
    public BulkTank(){
        this.capacity = 2000; }
    
    public BulkTank(double capacity){
        this.capacity = capacity; }
    
    public double getCapacity(){
        return this.capacity;}
    
    public double getVolume(){
        return this.volume; }
    
    public double freeSpace(){
        return this.capacity - this.volume; }
    
    public void fillTank(double amount){
        double x = this.freeSpace();
        if(x > amount){
            volume += amount; }
        else volume += x; }
    
    public void pourTank(double amount){
        if(volume > amount){
            volume -= amount; }
        else volume = 0; }
    
    public String toString(){
        return "Bulk Tank: " + this.volume + "/" + this.capacity; }
    
    

}

