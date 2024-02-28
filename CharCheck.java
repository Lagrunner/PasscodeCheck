public class CharCheck {
    public static boolean charCheck(String password) {
        boolean containChar = false;
    
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetter(password.charAt(i))) {
                containChar = true;
                break;
            }        
        }   
/*
        if(!containChar) {
          System.out.println("Must contain a character!");
            }
*/
        return containChar;
    }
}
