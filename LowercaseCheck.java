public class LowercaseCheck {
    public static boolean lowercaseCheck(String password) {
        boolean isCotainLowerCase = false;

        for(int i = 0; i < password.length(); i++) {
            if(Character.isLowerCase(password.charAt(i))) {
            return true;
            }
        }   
        return isCotainLowerCase;
    } 
}