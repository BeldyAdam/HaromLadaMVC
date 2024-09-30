package main;

import controller.CuiVezerlo;
import controller.FelugroVezerlo;
import controller.KonzolVezerlo;
import model.JatekModel;
import view.CuiNezet;
import view.FelugroNezet;
import view.KonzolNezet;


public class KincsesLada {


    public static void main(String[] args) {
//        System.out.println(new JatekModel().kezdes());
//        new JatekModel();
        JatekModel model = new JatekModel();
//        KonzolNezet nezet = new KonzolNezet();
//        new KonzolVezerlo(model, nezet);
        
//        FelugroNezet fNezet = new FelugroNezet();
//        new FelugroVezerlo(model, fNezet);
        CuiNezet nezet;
        nezet = new KonzolNezet();
//        nezet = new FelugroNezet();
//        new KonzolVezerlo(model, nezet);
        new CuiVezerlo(model, nezet);
        
        
    }
    
}
