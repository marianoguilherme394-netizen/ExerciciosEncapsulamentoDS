/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex15_15_ClasseEnderecoComValidaçãoDeCEP;

/**
 *
 * @author Admin
 */
public class Teste {
    public static void main (String [] args){
        Endereco e1 = new Endereco();
        e1.setRua("Rua Cuanaxos");
        e1.setBairro("Penha");
        e1.setCep("09755897");
        
        e1.Info();
    }
}
