import java.util.Scanner;
/**
 * Selects largest number from a set of 3
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //creates scanner for user input
    Scanner input = new Scanner(System.in);

    //Gets number from user
    System.out.println("Please enter three integers on separate lines");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();

    //selects largest number
    if(num1 >= num2 + num3){
      System.out.println("Maximum: " + num1);
    }
    if(num2 >= num1 + num3){
      System.out.println("Maximum: " + num2);
    }
    if(num3 >= num2 + num1){
      System.out.println("Maximum: " + num3);
    }else{
      System.out.println("Maximum : " + num1);
    }
    
    
  }
}
