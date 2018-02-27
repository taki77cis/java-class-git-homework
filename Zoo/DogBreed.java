public class DogBreed extends AnimalType{
  
  
   private String breed = "Husky";
   DogBreed(String name){
     super(name);
   }

 public String getbreed(){
     return breed;
   }
  
     public static void main(String args[]){
     DogBreed DB = new DogBreed("RIX");
     System.out.println("Name: " + DB.getName());
     System.out.println("DogBreed: " + DB.getbreed());
     System.out.println("Sound: " + DB.getSound());
     System.out.println("Weight: " + DB.getWeight());
   }
}