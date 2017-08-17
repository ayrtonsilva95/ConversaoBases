/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.conversao;

/**
 *
 * @author ayrton.silva
 */
public class Test {
    
     public static void main(String[] args) {
         
         Decimal d1 = new Decimal(2018);
         
         System.out.println(d1);
         d1.converteDecimalParaBinario();
         d1.converteDecimalParaHexadecimal();
         d1.converteDecimalParaOctal();
         
         System.out.println("---------------------------------------------");
         
         Binario b1 = new Binario("11111100010");
         System.out.println(b1);
         b1.converteBinarioParaDecimal();
         b1.converteBinarioParaHexadecimal();
         b1.converteBinarioParaOctal();
        
         System.out.println("---------------------------------------------");
         
         Hexadecimal h1 = new Hexadecimal("7E2");
         System.out.println(h1);
         h1.converteHexadecimalParaBinario();
         h1.converteHexadecimalParaDecimal();
         h1.converteHexadecimalParaOctal();
     }
    
    
}
