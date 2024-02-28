public class SpaceCheck {
    public static boolean spaceCheck(String password) {
        boolean isContainWhiteSpace = true;

        for(int i = 0; i < password.length(); i++) {
            if(Character.isWhitespace(password.charAt(i))) {
                isContainWhiteSpace = false;
            }
        } 
        return isContainWhiteSpace;
    } 
}   
