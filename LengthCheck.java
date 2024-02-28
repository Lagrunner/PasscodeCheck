public class LengthCheck {
    // an alternative version
    // public static String lengthCheck(String password);
    // return password.length() >= 8;
  public static boolean lengthCheck(String password) {
    int passcodeLength = 0;

    for(int i = 0; i < password.length(); i++) {
      passcodeLength++ ;
      }

      if(passcodeLength >= 8 && passcodeLength <= 16) {
        return true;
        } else {
          //System.out.println("Password between 8-16 charaters!");
          return false;
          }
  }
}
