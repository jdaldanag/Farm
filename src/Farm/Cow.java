package Farm;
import java.util.Random;
import java.math.*;

public class Cow implements Milkable, Alive{
    private String name;
    private double capacity = 15 + new Random().nextInt(26);
    private double milk = 0;
    
    private static final String[] names = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Cow(){
        int x = new Random().nextInt(names.length);
        this.name = names[x];  }
    
    public Cow(String name){
        this.name = name;}
    
    public String getName(){
        return this.name;}
    
    public double getCapacity(){
        return this.capacity; }
    
    public double getAmount(){
        return Math.ceil(milk);}
    
    public double milk(){
        double x = Math.ceil(milk);
        milk = 0;
        return x; }
    
    public void liveHour(){
        double x = 2.0 - new Random().nextDouble();
        this.milk += x; }
    
    public String toString(){
        return this.name + ": " + Math.ceil(milk) + "/" + Math.ceil(capacity); }
    
    
    
}
