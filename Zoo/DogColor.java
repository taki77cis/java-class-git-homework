public class DogColor extends DogBreed {
   private String color="Wight";
   DogColor(String name){
     super(name);
     }
   public String getcolor(){
     return color;
   }
   public static void main(String args[]){
     DogColor  DC = new DogColor ("RIX");

     System.out.println("Name: " + DC.getName());
     System.out.println("DogBreed: " + DC.getbreed());
     System.out.println("Color: " + DC.getcolor());
     System.out.println("Sound: " + DC.getSound());
     System.out.println("Weight: " + DC.getWeight());
   }
}