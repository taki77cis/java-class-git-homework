
public class Student {
  private static int nextId = 1;
  private int id;
  private String firstName;
  private String lastName;
  private int grade;

  public Student(String firstName, String lastName) {
    this.id = getNextId();
    this.firstName = firstName;
    this.lastName = lastName;
    this.grade = 0;
  }

  static int getNextId() {
    return nextId++;
  }

  public int getId() {
    return this.id;
  }

  public void assignId() {
    this.id = getNextId();
  }

  public void setFirstName(String newFirstName) {
    this.firstName = newFirstName;
  }

  public void setLastName(String newLastName) {
    this.lastName = newLastName;
  }

public String getFirstName(String newFirstName) {
    return  newFirstName;
  }

  public String getLastName(String newLastName) {
    return newLastName;
  }
public void setGrade(int grade)throws Exception{
if (grade < 0 || grade > 100) {throw new Exception("gradr between 0 & 100");}
else    this.grade = grade;

   }
}
