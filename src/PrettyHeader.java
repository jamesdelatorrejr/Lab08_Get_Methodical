import java.util.Scanner;

public class PrettyHeader
{
    public static void main(String[] args) {

        Scanner pipe = new Scanner(System.in);

        String header = SafeInput.PrettyHeader("Woahhh");

        System.out.println(header);
    }
}
