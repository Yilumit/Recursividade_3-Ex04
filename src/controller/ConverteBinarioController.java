package controller;

public class ConverteBinarioController{
  public ConverteBinarioController{
    super();
  }

  public String converteBinario(int numInteiro){
    if( numInteiro<1){ 
      return 0;
    }else{
      int binario = numInteiro%2;
      String convertido = converteBinario(numInteiro/2) + String.value(binario);
      return convertido;
  }
}
