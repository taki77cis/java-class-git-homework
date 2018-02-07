import java.util.Scanner;
public class DiceRoll{
public static void main(String[]args){

do {
	  int dice1=((int)(Math.random() * (6 - 0) + 0));
	  int dice2=((int)(Math.random() * (6 - 0) + 0));
          System.out.println("Roll #1: "+ dice1);
          System.out.println("Roll #2: "+ dice2);
	  System.out.println("The total is "+(dice1+dice2)+"!\n");
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
 }while (true);
}
}

