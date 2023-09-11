
public class h2 {
    public static void main(String[] args) {
        int a = 10;
	    float b = 39.370f;
	    float jagamine;
		
        jagamine = a / b;
		
		System.out.println(jagamine + "  meetrit");
	    number2();
        
        number3(300);
        
        number4();

    }

    static void number2(){
   
        int c = 6;
        int d = 3;
        float pi = 3.14f;
        
        float arv = c*d*pi;
        System.out.println( arv + "HJAJHAHAJA" );    
    }
    static void number3(int arv){
        
        
        long hours = ( arv /60);
        System.out.printf(hours + "  tundi?" );

    }
    static void number4(){
            double s1 = sportlasekiirus(50, 876431);
            double s2 = sportlasekiirus(2000, 90);
            double vahe = s1 - s2;
            System.out.println("kiirus vahe " + Math.abs(vahe)  );
    
        }
            static double sportlasekiirus(int dis, int aeg){
                double kiirus = dis / aeg;
    
                System.out.println( kiirus + "m/s?");
                return kiirus;
            }
}

        
        
    



