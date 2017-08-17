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
public class Decimal {
    private int valor;

    public Decimal(int valor) {
        this.setValor(valor);
    }

   
    
    // Decimal para Binário
   public void converteDecimalParaBinario() {
   int resto = -1;
   int aux = this.getValor();
   StringBuilder sb = new StringBuilder();
 
   if (aux == 0) {
       System.out.println("0");
   }
 
   // enquanto o resultado da divisão por 2 for maior que 0 adiciona o resto ao início da String de retorno
   while (aux > 0) {
      resto = aux % 2;
      aux = aux / 2;
      sb.insert(0, resto);
   }
 
   System.out.println("Valor Binário: " + sb.toString());
  
}
    
   // Decimal para Hexadecimal
   public void converteDecimalParaHexadecimal() {
   char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
   int resto = -1;
   int aux = this.getValor();
   StringBuilder sb = new StringBuilder();
 
   if (aux == 0) {
       System.out.println("0");
   }
 
   // enquanto o resultado da divisão por 16 for maior que 0 adiciona o resto ao início da String de retorno
   while (aux > 0) {
      resto = aux % 16;
      aux = aux / 16;
      sb.insert(0, hexa[resto]);
   }
 
       System.out.println("Valor Hexadecimal: " + sb.toString());
}
   
   
   // Decimal para Octal
   public void converteDecimalParaOctal() {
   int resto = -1;
   int aux = this.getValor();
   StringBuilder sb = new StringBuilder();
 
   if (aux == 0) {
      System.out.println("0");
   }
 
   // enquanto o resultado da divisão por 8 for maior que 0 adiciona o resto ao início da String de retorno
   while (aux > 0) {
      resto = aux % 8;
      aux = aux / 8;
      sb.insert(0, resto);
   }
 
   System.out.println("Valor Octal: " + sb.toString());
}

    @Override
    public String toString() {
        return "Decimal / Valor Original: " + this.getValor();
    }

        
        
        

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
  


    

   
}
