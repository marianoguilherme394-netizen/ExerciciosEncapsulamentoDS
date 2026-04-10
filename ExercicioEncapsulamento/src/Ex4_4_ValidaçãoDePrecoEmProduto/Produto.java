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
public class Produto {
    
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco>0){
            this.preco = preco;
        }
        else{
            this.preco = 0;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void Info(){
        System.out.println("------ Informacoes do produto ------");
        System.out.println("Nome: " + getNome());
        System.out.println("Quantidade: " + getQuantidade());
        
        if(getPreco()>0){
            System.out.println("Preço: " + getPreco());
        }
        else{
            System.out.println("Atribuição rejeitada");
        }
    }
    
    
}
