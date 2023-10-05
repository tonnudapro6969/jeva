//tonis kandmaa it22
//alustasin 1.10.23 ja lopuks 3.10.23 tulin tagasi et fixida bugid ja tehtud

public class  ylesanne81 {
    public static double kuubiruumala(String kulg) {
        double kuljepikkus = Double.parseDouble(kulg); //arvutab KUUBI kuljepikkust 3korda. parseDouble() teeb  kuljepikkused teevad kindlateks arvudeks
        
        return kuljepikkus * kuljepikkus * kuljepikkus; 
    }

    
    public static double risttahukaruumala(String pikkus, String laius, String korgus) {    // risttahuka ruumala arvutamine
        
        double pikkusDouble = Double.parseDouble(pikkus);            //arvutab pikkuse, all pool laius ja korgus. parseDouble() teeb  pikkus,laius ja korguse teevad kindlateks arvudeks
        
        
        double laiusDouble = Double.parseDouble(laius);
        
        double korgusDouble = Double.parseDouble(korgus);
        
        return pikkusDouble * laiusDouble * korgusDouble;  //phm arvutab ja lykkab alla vastuste koodi juurde
    }

  
    public static double puramiidiruumala(String aluspindala, String korgus) { //puramiidi ruamlala arvutamine
        
        double aluspindalaDouble = Double.parseDouble(aluspindala);  //arvutab aluspinna ja korguse. Teevad  aluspindlala ja korguse teevad kindlateks arvudeks
        
        double korgusDouble = Double.parseDouble(korgus);
        return (aluspindalaDouble * korgusDouble) / 3;  //arvutab ja jagab ja lykkab vastuse juurde kus prindib valja
    }

    public static void main(String[] args) {
        double kuubiruumala = ylesanne81.kuubiruumala("5");  ////kutsub valja kuubiruumala koodijupikese, et arvutada antud arvuga  ja saadab edasi ja all pool prindib vlaja
        System.out.println("Kuupij ruumala: " + kuubiruumala);


        double risttahukaruumala = ylesanne81.risttahukaruumala("3", "4", "5");  //kutsub valja risttahuka koodijupikese et arvutada antud arvudega ja saadab edasi ja all pool prindib vlaja
        System.out.println("risttttahuka ruumala: " + risttahukaruumala);




        double puramiidiruumala = ylesanne81.puramiidiruumala("6", "4"); //kutsub valja puramiidruumala koodijupi, et arvutada antud arvudega milleks on al 6 ja korg 4  ja saadab edasi ja all pool prindib vlaja
        System.out.println("pjuraramiidi ruumala: " + puramiidiruumala);
    }
}
