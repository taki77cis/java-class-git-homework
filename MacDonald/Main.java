public class Main {
 public static void main(String[] args) {
    System.out.println("Old MacDonald Had A Farm");
    System.out.println("Brought to you by Java!");
    System.out.println("");

    Animal[] animals = {
      new Cow(),
      new Dog(),
      new Cat(),
      new Horse(),
      new Duck(),
         };

    for (int i=0; i < animals.length; i++) {
      animals[i].singVerse();
                                         }
  }
  }

