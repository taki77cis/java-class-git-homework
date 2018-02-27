public class Sheep extends Animal{
 
   private String name;
   private String sound = "Baahahaa...";
   private int Weight=150;
   Sheep(String name){
     super(name);
   }
   public String getSound(){
     return sound;
   }
 public int getWeight(){
     return Weight;
   }
   public static void main(String args[]){
     Sheep shelly = new Sheep("Shelly");
     System.out.println("Name: " + shelly.getName());
     System.out.println("Sound: " +shelly.getSound());
     System.out.println("Weight: " +shelly.getWeight());
   }
}