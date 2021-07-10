package userregistration;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration
{

    Scanner scanner = new Scanner(System.in);

    public static final String EMAILPATTERN = "([0-9A-Za-z])+([-+._][0-9A-Za-z]+)*" + "@([0-9A-Za-z])+[.]([a-zA-Z])+([.][A-Za-z]+)*";

    public static void main(String[] args) 
    {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.readInput();
    }
    //Method to read the input from the user
    private void readInput() 
    {
        System.out.println("Enter email id ");
        String EmailId = scanner.next();
        validateInput(EMAILPATTERN,EmailId);
    }

    private void validateInput(String pattern, String input) 
    {

        if(Pattern.matches(pattern, input)) 
        {
            System.out.println("Valid");
        }
        else 
        {
            System.out.println("Invalid");
        }
    }
}