import java.util.Scanner;

public class ylesanne7 {
    public static void main(String[] args) {
        System.out.println("ANAALSEKSSESKESEKSE YLESANNE 7");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("esimene arv kallis:  ");
        double A = scanner.nextDouble();

        System.out.print("B ARV EH KTEINE PALUN: ");
        double B = scanner.nextDouble();

        if (A == B) {
            System.out.println("UAAAAAAAAAAAAAAHHHHHHHHHHHHHHHHHH.");
            System.out.print("number palun pissikaka: ");
            B = scanner.nextDouble();
        }

        double jagamine = A / B;
        System.out.println( "Vastus on :  " +  jagamine );
        scanner.close();

}   }