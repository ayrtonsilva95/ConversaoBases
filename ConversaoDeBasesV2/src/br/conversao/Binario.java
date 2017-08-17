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
public class Binario {

    private String valorBinario;

    public Binario(String valorBinario) {
        this.setValorBinario(valorBinario);
    }

    // Binário para Decimal
    public void converteBinarioParaDecimal() {
        int valor = 0;

        // soma ao valor final o dígito binário da posição * 2 elevado ao contador da posição (começa em 0)
        for (int i = this.getValorBinario().length(); i > 0; i--) {
            valor += Integer.parseInt(this.getValorBinario().charAt(i - 1) + "") * Math.pow(2, (this.getValorBinario().length() - i));
        }

        System.out.println("Valor Decimal: " + valor);

    }
    
    
    public void converteBinarioParaOctal() {
        int valor = 0;
        for (int i = this.getValorBinario().length(); i > 0; i--) {
            valor += Integer.parseInt(this.getValorBinario().charAt(i - 1) + "") * Math.pow(2, (this.getValorBinario().length() - i));
        }
        
        System.out.println("Valor Octal: " + Integer.toOctalString(valor));
        
    }

    public void converteBinarioParaHexadecimal() {

        String s;
        s = this.getValorBinario();
        int i = Integer.parseInt(s, 2);
        String x = String.format("%02X", i);
        System.out.println("Valor Hexadecimal: " + x);

    }

    @Override
    public String toString() {
        return "Binário / Valor Original: " + this.getValorBinario();
    }

    public String getValorBinario() {
        return valorBinario;
    }

    public void setValorBinario(String valorBinario) {
        this.valorBinario = valorBinario;
    }

}
