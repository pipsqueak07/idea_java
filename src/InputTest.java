import java.io.Console;
import java.util.*;
public class InputTest {
    public static void main(String[] args)
    {
        /**Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("How old are u?");
        int age = in.nextInt();

        System.out.println("Hello, "+name+".Next year, u will be "+(age+1));
        */
        Console cons = System.console();
        String username = cons.readLine("User name: ");
        char[] passwd = cons.readPassword("Password: ");
    }
}
