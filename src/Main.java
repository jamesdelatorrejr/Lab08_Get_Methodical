// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        int userInt = SafeInput.getRangedInt(pipe, "Enter a int", -1, 5);
        System.out.println(userInt);

    }
}