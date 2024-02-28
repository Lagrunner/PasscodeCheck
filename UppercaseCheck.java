public class UppercaseCheck {
    public static boolean uppercaseCheck(String password) {
        boolean isCotainUpperCase = false;

        for(int i = 0; i < password.length(); i++) {
            if(Character.isUpperCase(password.charAt(i))) {
            return true;
            } 
        }   
        return isCotainUpperCase;
    } 
}