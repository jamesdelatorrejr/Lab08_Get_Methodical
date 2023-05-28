import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args) {

        Scanner pipe = new Scanner(System.in);
        double favDouble = SafeInput.getDouble(pipe, "Enter your favorite double number");
        System.out.println("Your favorite double number is " + favDouble);

        int favInt = SafeInput.getInt(pipe, "Enter your favorite int number");
        System.out.println("Your favorite int number is " + favInt);
    }
}
