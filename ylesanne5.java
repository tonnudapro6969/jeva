import java.util.Scanner;
// tonis kandmaa it-22
public class ylesanne5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            System.out.println("sisesta eisemne arv: ");
            double esimeneArv = scanner.nextDouble();
            
            System.out.println("sisesta jagaja: ");
            double teineArv = scanner.nextDouble();
            
            if (esimeneArv >= 0 && teineArv > 0) {
                double tulemus = esimeneArv / teineArv;
                System.out.println("vastus: " + tulemus);
            } else {
                System.out.println("Midagi on valesti. Soovitan vetsus enesetapp sooritada");
        }
        
        scanner.close();
    }
}
}