import java.util.Scanner;
public class SafeInput
{
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do
        {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return an int and ensure that it is an int
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int userInt = 0;
        boolean done = false;
        do
        {
            System.out.println("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
                userInt = pipe.nextInt();
                done = true;
            }
            else
            {
                System.out.println("Please enter an int.");
                done = false;
                pipe.nextLine();
            }
        } while (!done);

        return userInt;

    }

    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return an double and ensure that it is an double
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double userDouble = 0;
        boolean done = false;
        do
        {
            System.out.println("\n" + prompt + ": ");
            if (pipe.hasNextDouble())
            {
                userDouble = pipe.nextDouble();
                done = true;
            }
            else
            {
                System.out.println("Please enter an int.");
                done = false;
                pipe.nextLine();
            }
        } while (!done);

        return userDouble;

    }
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param lo low range for int
     * @param hi high range for int
     * @return an int and ensure that it is an int
     */
    public static int getRangedInt(Scanner pipe, String prompt, int lo, int hi)
    {
        int userInt = 0;
        boolean done = false;
        do
        {
            System.out.println("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
                userInt = pipe.nextInt();
                done = true;
            }
            else
            {
                System.out.println("Please enter an int.");
                done = false;
                pipe.nextLine();
            }
            if (userInt >= lo && userInt <= hi)
            {
                System.out.println("You have entered a number " + userInt + " that is in range.");
            }
            else
            {
                //done = false;
                System.out.println("Number " + userInt + " is not in range. Please pick a number between " + lo + "-" + hi);
                getRangedInt(pipe, "Enter a int", lo, hi);
            }
        } while (!done);

        return userInt;

    }


}
