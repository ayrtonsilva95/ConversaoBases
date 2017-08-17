/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.conversao;

import java.util.Arrays;

/**
 *
 * @author ayrton.silva
 */
public class Hexadecimal {
    
    private String valorHexa;

    public Hexadecimal(String valorHexa) {
        this.setValorHexa(valorHexa);
    }
    
    
    public void converteHexadecimalParaBinario() {
        int decimal;
        
        decimal = Integer.parseInt(this.getValorHexa(), 16);
        System.out.println("Valor Binário: " + Integer.toBinaryString(decimal));
        
    }
    
    
    
   public void converteHexadecimalParaDecimal() {
   int valor = 0;
   int posicaoCaractere = -1;
   char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
 
   // soma ao valor final o dígito binário da posição * 16 elevado ao contador da posição (começa em 0)
   for (int i=this.getValorHexa().length(); i>0; i--) {
      posicaoCaractere = Arrays.binarySearch(hexa, this.getValorHexa().charAt(i-1));
      valor += posicaoCaractere*Math.pow(16, (this.getValorHexa().length()-i));
   }
 
       System.out.println("Valor Decimal: " + valor); 
}
    
   
   
 public void converteHexadecimalParaOctal() {
   int valor = 0;
   int posicaoCaractere = -1;
   char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
 
   // soma ao valor final o dígito binário da posição * 16 elevado ao contador da posição (começa em 0)
   for (int i=this.getValorHexa().length(); i>0; i--) {
      posicaoCaractere = Arrays.binarySearch(hexa, this.getValorHexa().charAt(i-1));
      valor += posicaoCaractere*Math.pow(16, (this.getValorHexa().length()-i));
   }
   int valorDecimal = valor;
 
     System.out.println("Valor Octal: " + Integer.toOctalString(valorDecimal));
     
}
   
   
    
    @Override
    public String toString() {
        return "Hexadecimal / Valor Original: " + this.getValorHexa();
    }

    
    
    
    
    
    
    
    
    
    

    public String getValorHexa() {
        return valorHexa;
    }

    public void setValorHexa(String valorHexa) {
        this.valorHexa = valorHexa;
    }
    
    
 
    
    
    
    
    
}
