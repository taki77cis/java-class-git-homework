import java.time.*;
public class birthdays{
public static void main(String []args){
LocalDate dt2= LocalDate.of(1977,03,11);
LocalDate dt1= LocalDate.now();
System.out.println("My next 10 birthdays: ");
for (int i=40;i<50;i++){
System.out.println((1977+i)+":"+dt1.plusYears(i).getDayOfWeek());
}
}
}