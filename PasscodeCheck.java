import java.util.List;
import java.util.Scanner;

public class PasscodeCheck {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter your password: ");
    String password = in.nextLine();
    List<String> errorMessages = IsValid.isValid(password);

    while (!errorMessages.isEmpty()) {
      for(String error: errorMessages) {
        System.out.println(error);
      }
        System.out.println("Password is invalid!\n");
        errorMessages.clear();
        System.out.println("Please enter your password again: ");
        password = in.nextLine();
        errorMessages = IsValid.isValid(password);
      }
        System.out.println("Password is valid!");
        in.close();
      } 

    }
  /*
    //無循環版
    
    if(errorMessages.isEmpty()) {
      System.out.println("Password is valid!");
    } else {
      for(String error: errorMessages) {
        System.out.println(error);
      } 
      System.out.println("Password is invalid!");
    }
  */          