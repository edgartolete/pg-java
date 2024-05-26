package src.com.edgar;
import java.util.Date;

public class Main {
  public static void main(String[] args){
    System.out.println("test");
    
    byte age = 30;
    System.out.println("age: " + age);
    
    long viewsCount = 3_123_456_789L;
    float price = 10.99F;

    Date now = new Date();
    System.out.println("current time: " + now);

    char letter = 'A';
    boolean isEligible = true;
    System.out.println("age: " + isEligible);

  }
}
