package model;


public class JatekModel {
    
    
    private LadaModel[] ladak;
    private int valasztas;
    private final String nemTalalt = "Nem ebben volt a kincs!";

    public JatekModel() {
        valasztas = -1;
        ladak = new LadaModel[3];
        ladak[0] = new LadaModel("arany", "Én rejtem a kincset!");
        ladak[1] = new LadaModel("ezüst", "Nem én rejtem a kincst!", true);
        ladak[2] = new LadaModel("bronz", "Az arany hazudik!");
    }

    public int getValasztas() {
        return valasztas;
    }
    
    public void setValasztas(int valasztas) {
        this.valasztas = valasztas;
    }

    public String kezdes() {
        String szoveg = "Hol a kincs? Csak az egyik felirat igaz!\n";
        szoveg += ladak[0].getAnyag() + " \t-\t" + ladak[0].getFelirat() + "\n";
        szoveg += ladak[1].getAnyag() + " \t-\t" + ladak[1].getFelirat() + "\n";
        szoveg += ladak[2].getAnyag() + " \t-\t" + ladak[2].getFelirat() + "\n";
        return szoveg;
    }



    public String ellenorzes() {
//        if(valasztas == 1){
//            megjelenit(nemTalalt);
//        }else if(valasztas == 2){
//            megjelenit("Ebben volt a kincs!");
//        }else if(valasztas == 3){
//            megjelenit(nemTalalt);
//        }else{
//            megjelenit("Hibás beírás!");
//        }
        
        String talalt = "Gratulálok, eltaláltad!";
        String nemTalalt = "Sajnos nem talált!";
        return ladak[valasztas].isKincs() ? talalt : nemTalalt;
        
    }
    

}
