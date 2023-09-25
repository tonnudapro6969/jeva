

// tonis kandma it.-222 jahrjusuts 6
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ylesanne6 {
    public static void main(String[] args) {
        List<Integer> arvud = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Sisesta täisarv (jäta tühi kui done): ");
                String sisend = scanner.nextLine().trim();
                if (sisend.isEmpty()) {
                    break;
                }
                try {
                    int arv = Integer.parseInt(sisend);
                    arvud.add(arv);
                } catch (NumberFormatException e) {
                    System.out.println("viga juut.");
                }
            }
        }

        if (!arvud.isEmpty()) {
            double keskmine = keskmine(arvud);
            int summa = summa(arvud);

            try (PrintWriter writer = new PrintWriter("arvud.txt")) {
                for (int arv : arvud) {
                    writer.println(arv);
                }
                writer.println("Kogusumma: " + summa);
                writer.println("Keskmine: " + keskmine);
                System.out.println("Arvud on salvestatud faili arvud.txt");
            } catch (IOException e) {
                System.out.println("Viga : " + e.getMessage());
            }
        } else {
            System.out.println("Arvude loend on tuhgi debiial ik.");
        }
    }

    public static int summa(List<Integer> arvud) {
        int summa = 0;
        for (int arv : arvud) {
            summa += arv;
        }
        return summa;
    }

    public static double keskmine(List<Integer> arvud) {
        if (arvud.isEmpty()) {
            return 0;
        }
        int summa = summa(arvud);
        return (double) summa / arvud.size();
    }
}





































//seks