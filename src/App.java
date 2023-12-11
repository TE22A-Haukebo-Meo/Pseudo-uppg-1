import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        System.out.println("DroppaEttTal");
        int tal = tb.nextInt();
        if (tal<=10) {
            System.out.println(tal+" är mindre än eller lika med 10");
        }
        else if (tal>10){
            System.out.println(tal+" är större än 10");
        }
    }
}
