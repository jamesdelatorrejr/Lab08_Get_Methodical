import java.util.Scanner;
public class RegExIsMagic
{
    public static void main(String[] args)
    {
        Scanner pipe = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(pipe, "Enter your social security number xxx-xx-xxxx", "\\d{3}-\\d{2}-\\d{4}");
        String ucStudentM = SafeInput.getRegExString(pipe, "Enter your UC M number", "(M|m)\\d{5}");
        String menuChoice = SafeInput.getRegExString(pipe, "Enter menu choice O,S,V,Q", "[OoSsVvQq]");
    }
}
