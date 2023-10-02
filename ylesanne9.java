
import java.util.Date;

// Tsikli klass
class Tsikkel {
    private int aasta;
    
    public Tsikkel(String mudel, int aasta) {
        this.aasta = aasta;
    }
    
    
    public int getAasta() {
        return aasta;
    }
}

// Sõitja klass
class Soitja {
    private String nimi;
    private int vanus;
    
    public Soitja(String nimi, int vanus) {
        this.nimi = nimi;
        this.vanus = vanus;
    }
    
    public String getNimi() {
        return nimi;
    }
    
    public int getVanus() {
        return vanus;
    }
}

// Treeningraja klass
class Treeningrada {
    private String nimi;
    private String asukoht;
    
    public Treeningrada(String nimi, String asukoht) {
        this.nimi = nimi;
        this.asukoht = asukoht;
    }
    
    public String getNimi() {
        return nimi;
    }
    
    public String getAsukoht() {
        return asukoht;
    }
}

// Treeningklass, mis ühendab kõik eelnevad klassid
class Treening {
    private Tsikkel tsikkel;
    private Soitja soitja;
    private Treeningrada treeningrada;
    private Date treeninguAeg;
    
    public Treening(Tsikkel tsikkel, Soitja soitja, Treeningrada treeningrada, Date treeninguAeg) {
        this.tsikkel = tsikkel;
        this.soitja = soitja;
        this.treeningrada = treeningrada;
        this.treeninguAeg = treeninguAeg;
    }
    
    public void printTreeningInfo() {
        System.out.println("Treening info:");
        System.out.println("Sõitja: " + soitja.getNimi() + " (" + soitja.getVanus() + " aastat)");
        System.out.println("Tsikkel: " + "toyta" + " (" + tsikkel.getAasta() + ")");
        System.out.println("Treeningrada: " + treeningrada.getNimi() + " (" + treeningrada.getAsukoht() + ")");
        System.out.println("Treeningu aeg: " + treeninguAeg);
    }
}

public class ylesanne9 {
    public static void main(String[] args) {
        // Loome tsiklid, sõitjad ja treeningradad
        Tsikkel tsikkel1 = new Tsikkel("totya", 2021);
        Tsikkel tsikkel2 = new Tsikkel("ninja", 2022);
        
        Soitja soitja1 = new Soitja("Marten", 25);
        Soitja soitja2 = new Soitja("Laura", 30);
        
        Treeningrada rada1 = new Treeningrada("tallinna rada", "tallin");
        Treeningrada rada2 = new Treeningrada("parnu rada", "parnu");
        
        // Loome treeningud
        Treening treening1 = new Treening(tsikkel1, soitja1, rada1, new Date());
        Treening treening2 = new Treening(tsikkel2, soitja2, rada2, new Date());
        
        // Kuvame treeninguinfo
        treening1.printTreeningInfo();
        System.out.println();
        treening2.printTreeningInfo();
    }
}
