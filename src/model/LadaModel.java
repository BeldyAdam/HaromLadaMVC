package model;

public class LadaModel {
    private String anyag, felirat;
    private boolean kincs;

    
    public LadaModel(String anyag, String felirat) {
        this(anyag, felirat, false);
    }
    
    
    public LadaModel(String anyag, String felirat, boolean kincs) {
        this.anyag = anyag;
        this.felirat = felirat;
        this.kincs = kincs;
    }

    public String getAnyag() {
        return anyag;
    }

    public String getFelirat() {
        return felirat;
    }

    public boolean isKincs() {
        return kincs;
    }
    
    public void kincsetElhelyez(){
        this.kincs = true;
    }
    
    public void kincsetKivesz(){
        this.kincs = false;
    }

    
    
}
