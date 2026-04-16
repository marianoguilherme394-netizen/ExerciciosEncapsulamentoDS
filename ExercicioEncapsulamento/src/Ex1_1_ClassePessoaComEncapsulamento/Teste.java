package Ex1_1_ClassePessoaComEncapsulamento;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Teste {
    public static void main (String [] args){
        Pessoa p1 = new Pessoa();
        p1.setNome("Isabella");
        p1.setCpf("567.982.345.68");
        p1.setIdade(18);
        
        p1.info();
    }
    
}
