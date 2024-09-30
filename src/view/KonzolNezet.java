package view;

import java.util.Scanner;


public class KonzolNezet extends CuiNezet{
    
    private static final Scanner sc = new Scanner(System.in);
    
    @Override
    public void megjelenit(String szoveg){
        System.out.println(szoveg);
    }
    
    @Override
    public int bekeres() {
        megjelenit("Melyik ládát választod? 1. 2. 3.\n");
        return sc.nextInt() -1;
    }
}
