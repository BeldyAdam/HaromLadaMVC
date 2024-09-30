package main;

import controller.FelugroVezerlo;
import controller.KonzolVezerlo;
import model.JatekModel;
import view.FelugroNezet;
import view.KonzolNezet;


public class KincsesLada {


    public static void main(String[] args) {
//        System.out.println(new JatekModel().kezdes());
//        new JatekModel();
        JatekModel model = new JatekModel();
        KonzolNezet nezet = new KonzolNezet();
//        new KonzolVezerlo(model, nezet);
        
        FelugroNezet fNezet = new FelugroNezet();
        new FelugroVezerlo(model, fNezet);
        
    }
    
}
