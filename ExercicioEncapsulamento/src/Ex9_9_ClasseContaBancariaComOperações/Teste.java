/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex9_9_ClasseContaBancariaComOperações;

/**
 *
 * @author Admin
 */
public class Teste {
    public static void main (String [] args){
        ContaBancaria c1 = new ContaBancaria();
       
        c1.setNumeroConta("12345");
        c1.setTitular("Isabella");
        c1.depositar(350.00);
        c1.sacar(10000.00);
    }
    
}
