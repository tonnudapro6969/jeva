public class ylesanne82 {
    String nimi;
    int vanus;
    
    // Konstruktor
    public ylesanne82(String n, int v) {
        this.nimi = n;
        this.vanus = v;
    }
    
    public ylesanne82() {
        this.nimi = "Arnold sitakaru II";
        this.vanus = 0;
    }
    
    public void tutvustaEnd() {
        System.out.println("Mina olen " + nimi + ", " + vanus + " aastat vana!");
    }

    public static void main(String[] args) {
        // Example usage
        ylesanne82 lehm1 = new ylesanne82("alfred XXI", 5);
        lehm1.tutvustaEnd();

        ylesanne82 lehm2 = new ylesanne82();
        lehm2.tutvustaEnd();
    }
}
