/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2_2_ValidacaoDeIdade;

/**
 *
 * @author Admin
 */
public class teste {
    public static void main (String [] args){
        
        PessoaValidacao p1 = new PessoaValidacao();
        p1.setNome("Isabella");
        p1.setIdade(18);
        p1.setCpf("456.098.123-75");
        
        p1.Info();
    }
    
}
