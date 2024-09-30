package view;

import javax.swing.JOptionPane;

public class FelugroNezet extends CuiNezet{
    
    @Override
    public void megjelenit(String szoveg){
        JOptionPane.showMessageDialog(null, szoveg);
    }
    
    @Override
    public int bekeres() {
        int v = Integer.parseInt(JOptionPane.showInputDialog("Melyik ládát választod? 1. 2. 3.\n"));
        return v -1;
    }
}
