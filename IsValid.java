import java.util.ArrayList;
import java.util.List;

public class IsValid {
    public static List<String> isValid(String password) { 
         List<String> errorMessage = new ArrayList<>();

        if(!LengthCheck.lengthCheck(password)) 
            {
            errorMessage.add("Password between 8-16 charaters!");
            }
        if(!NumCheck.numCheck(password))
            {
            errorMessage.add("Must contain a number!");
            }
        if(!CharCheck.charCheck(password)) 
            {
            errorMessage.add("Must contain a character!");
            }
        if(!LowercaseCheck.lowercaseCheck(password))
            {
            errorMessage.add("Must contain a lower case letter!");
            }
        if(!UppercaseCheck.uppercaseCheck(password))
            {
            errorMessage.add("Must contain a upper case letter!");
            }
        if(!SpaceCheck.spaceCheck(password))
            {
            errorMessage.add("White space is not accepted!");
            }

/*      if(LengthCheck.lengthCheck(password) && CharCheck.charCheck(password) && NumCheck.numCheck(password)) {
            return true;
        }
*/        
        return errorMessage;
    } 
} 
