package model;

import java.util.Scanner;


public class Jatek {
    
    private static final Scanner sc = new Scanner(System.in);
    private Lada[] ladak;
    private int valasztas;
    private final String nemTalalt = "Nem ebben volt a kincs!";

    public Jatek() {
        valasztas = -1;
        ladak = new Lada[3];
        ladak[0] = new Lada("arany", "Én rejtem a kincset!");
        ladak[1] = new Lada("ezüst", "Nem én rejtem a kincst!", true);
        ladak[2] = new Lada("bronz", "Az arany hazudik!");
        
        megjelenit(kezdes());
        bekeres();
    }

    public String kezdes() {
//        System.out.println("Hol a kincs? Csak az egyik felirat igaz!");
        String szoveg = "Hol a kincs? Csak az egyik felirat igaz!\n";
        szoveg += ladak[0].getAnyag() + " \t-\t" + ladak[0].getFelirat() + "\n";
        szoveg += ladak[1].getAnyag() + " \t-\t" + ladak[1].getFelirat() + "\n";
        szoveg += ladak[2].getAnyag() + " \t-\t" + ladak[2].getFelirat() + "\n";
        return szoveg;
    }

    private void bekeres() {
        megjelenit("Melyik ládát választod? 1. 2. 3.\n");
        valasztas = sc.nextInt() -1;
        megjelenit(ellenorzes());
    }

    private String ellenorzes() {
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
    
    private void megjelenit(String szoveg){
        System.out.println(szoveg);
    }
}
