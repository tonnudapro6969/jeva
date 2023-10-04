// Looma.java
public class ylesanne10 {
    private String nimi;
    private String kart;
    private String toit;
    private char liikumisviis;

    public ylesanne10(String nimi, String kart) {
        this.nimi = nimi;
        this.kart = kart;
        this.toit = toit;
        this.liikumisviis = liikumisviis;
    }

public void liigu() {
    if (liikumisviis == 'F') {
        System.out.println(nimi + " lendab.");
    } else if (liikumisviis == 'M') {
        System.out.println(nimi + " ujub.");
    } else {
        System.out.println(nimi + " liigub.");
    }
}
public void toit() {
    if (kart.equals("N")) {
        System.out.println(nimi + " toitub lihast.");
    } else if (kart.equals("M")) {
        System.out.println(nimi + " toitub taimedest.");
    } else {
        System.out.println("molemast.");
        }
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }
    public void settoit(String toit) {
        this.toit = toit;
    }

    public String gettoit() {
        return toit;
    }

  
    public String getSugu() {
        return kart;
    }
    public static void main(String[] args) {
        ylesanne10 madu = new ylesanne10("madur", "F");
        ylesanne10 tuvi = new ylesanne10("tuvi", "M" );
        ylesanne10 rebane = new ylesanne10("Rebane", "N");

        madu.liigu();
        madu.toit();

        tuvi.liigu();
        tuvi.toit();

        rebane.liigu();
        rebane.toit();
    }
}
