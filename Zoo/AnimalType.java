public class AnimalType extends Animal{
   private String AnimalType="Dog"; 
   private String sound = "Woof";
   private int Weight = 100;
   AnimalType(String name){
     super(name);
   }
   public String gettype(){
   return AnimalType;
   }

   public String getSound(){
     return sound;
   }

   public int getWeight(){
     return Weight;
   }
   public static void main(String args[]){
     AnimalType dog = new AnimalType("RIX");

     System.out.println("Animal type: " + dog.gettype());
     System.out.println("Name: " + dog.getName());
     System.out.println("Sound: " +dog.getSound());
     System.out.println("Weight: " +dog.getWeight());
   }
}