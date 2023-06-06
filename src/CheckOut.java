import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner pipe = new Scanner(System.in);
        boolean anotherItem;
        double totalPrice = 0;
        do
        {
            double price = SafeInput.getRangedDouble(pipe, "Enter the price of your item", 0.50, 10.00);
            pipe.nextLine();
            totalPrice = price + totalPrice;
            anotherItem = SafeInput.getYNConfirm(pipe, "Do you have another item?(Y/N)");
        }
        while (anotherItem);
        System.out.printf("Your total price is $" + "%.2f", totalPrice);
    }
}
