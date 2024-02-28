public class NumCheck {
    public static boolean numCheck(String password) {
        boolean containNumber = false;
    
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                containNumber = true;
                break;
            }
        }
/*
        if(!containNumber) {
          System.out.println("Must contain a number!");
            }
*/
        return containNumber;
    } 
}