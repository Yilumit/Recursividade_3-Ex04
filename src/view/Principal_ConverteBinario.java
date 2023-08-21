package view;

import controller.ConverteBinarioController;

public class Principal_ConverteBinario{
  public static void main (String []args){
    ConverteBinarioController cMet = new ConverteBinarioController();
    int num = 25;
    if( num >2000){
      System.out.println("O número não pode ser maior que 2000!");
    }else{
      System.out.println("O número "+num+" convertido para binário fica "+cMet.converteBinario(num));
    }
  }
}
    
