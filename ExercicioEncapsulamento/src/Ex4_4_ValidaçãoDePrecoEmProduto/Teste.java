/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex4_4_ValidaçãoDePrecoEmProduto;

import Ex3_3_ClasseProdutoComEncapsulamento.*;

/**
 *
 * @author Admin
 */
public class Teste {
    public static void main(String [] args){
        
        Produto p1 = new Produto();
        
        p1.setNome("Bola de Volei");
        p1.setPreco(-20);
        p1.setQuantidade(100);
        
        p1.Info();
    }
    
}
