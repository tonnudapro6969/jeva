import java.util.Scanner;

public class iseseisev20 {
    public static arvutused(){
        Scanner scanner = new Scanner(System.in); //phm loob scanneri ehk input commandi

        System.out.print("sisesta  arv 1 ja 0 : ");  //kusib kasutajalt input
        scanner.close();

        try {
            String binarv = scanner.nextLine();   //viib kasutaja sisestatud arvu edasi? et saaks teistes commandides kasutada?
            int decarv = Integer.parseInt(binarv, 2);   //teisendab binaararvu decimal arvuks
        }
        
        return decarv;
    }
       
    }
    public static void main(String[] args) {
        
        int decarv = arvutused(decarv)

        System.out.println("decimal susteemi arv on: " + decarv); //prindib vastuse valja



}