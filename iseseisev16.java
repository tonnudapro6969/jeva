public class iseseisev16 {
            public static void main(String[] args) {
                int[] arvud = {3, 5, 3, 12, 5}; //dumbass list mis ei avane kui kusin arvud valja
                int summa = 0;
                
                
                for (int i = 0; i < arvud.length; i++) {  //leiab summa (avab listi ja liidab summaga kokku)
                    summa += arvud[i];
                }

                float keskmine = summa / arvud.length;  //leiab kesmise arvue vaga debiilsel viisil
        
                System.out.println("summa kokku: " + summa);   //prindib summaja keskmsied arvud
                System.out.println("arvude keskmine: " + keskmine);
            }
        }
        