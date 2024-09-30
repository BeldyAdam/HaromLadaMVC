package controller;

import model.JatekModel;
import view.CuiNezet;


public class FelugroVezerlo {
    private JatekModel model;
    private CuiNezet nezet;

    public FelugroVezerlo(JatekModel model, CuiNezet nezet) {
        this.model = model;
        this.nezet = nezet;
        
        start();   
    }

    private void start() {
        nezet.megjelenit(model.kezdes());
        model.setValasztas(nezet.bekeres());
        nezet.megjelenit(model.ellenorzes());
    }
}
