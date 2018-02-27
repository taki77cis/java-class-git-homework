public class Cow extends Animal{
 
   private String name;
   private String sound = "Moo...";
   private int Weight = 1400;
   Cow(String name){
     super(name);
   }
 
   public String getSound(){
     return sound;
   }

 public int getWeight(){
     return Weight;
   }
 
   public static void main(String args[]){
     Cow beefy = new Cow("beefy");
     System.out.println("Name: " + beefy.getName());
     System.out.println("Sound: " + beefy.getSound());
     System.out.println("Weight: " + beefy.getWeight());
    }
 }