import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        System.out.println("VadeDittAnvändarnamn?");
        String user = tb.nextLine();
        System.out.println("Vadärlösenordet?");
        String pass = tb.nextLine();
        if (user.equals("root") && pass.equals("pass")) {
            System.out.println("BROKIE!! Du har 0 kr");
        }
        else{
            System.out.println("Fel användarnamn eler lösenord");
        }
    }
}
