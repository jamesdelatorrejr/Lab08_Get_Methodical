import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner pipe = new Scanner(System.in);
        int birthYear = SafeInput.getRangedInt(pipe, "Enter a year 1950-2015", 1950, 2015);
        int birthMonth = SafeInput.getRangedInt(pipe, "Enter your birth month 1-12", 1, 12);
        switch (birthMonth)
        {
            case 1, 3, 5, 7, 8, 10, 12:
            {
                int birthDay = SafeInput.getRangedInt(pipe, "Enter your birth date 1-31", 1, 31);
            }
            case 4,6,9,11:
            {
                int birthDay = SafeInput.getRangedInt(pipe, "Enter your birth date 1-30", 1, 30);
            }
            case 2:
            {
                int birthDay = SafeInput.getRangedInt(pipe, "Enter your birth date", 1, 29);
            }
        }
        int birthHour = SafeInput.getRangedInt(pipe, "Enter your birth hour", 1, 24);
        int birthMinute = SafeInput.getRangedInt(pipe, "Enter your birth minute", 1, 59);
    }

}
