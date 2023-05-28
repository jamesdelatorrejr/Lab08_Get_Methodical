// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class GetUserName {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        String userInt = SafeInput.getNonZeroLenString(pipe, "Enter your username");
        System.out.println(userInt);

    }
}