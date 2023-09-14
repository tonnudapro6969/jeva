import java.util.Scanner;
public class ylesanne4{
    
	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("oghfeohe fknklef ko suvaline teks x3: ");
        String kasutajaTekst = scanner.nextLine();

        String suuredTähed = kasutajaTekst.toUpperCase();
        System.out.println("Suur täaeht: " + suuredTähed);

        int märkideArv = kasutajaTekst.length();
        System.out.println("markide arv: " + märkideArv);
        String[] sõnad = kasutajaTekst.split("\\s+");
        int sõnadeArv = sõnad.length;
        System.out.println("sünade arv: " + sõnadeArv);
        String esimeneSõna = sõnad[0];
        System.out.printf("ESIEME SONA: %s%n", esimeneSõna);

        scanner.close();
   
   
    }
}







    