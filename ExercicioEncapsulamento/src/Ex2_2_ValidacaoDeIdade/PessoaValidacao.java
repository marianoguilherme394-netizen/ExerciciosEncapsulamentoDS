/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2_2_ValidacaoDeIdade;

/**
 *
 * @author Admin
 */
public class PessoaValidacao {
    
    private String nome;
    private int idade;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade>0){
            this.idade = idade;
        }
        else{
            this.idade = 0;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void Info(){
        System.out.println("------ Informação da pessoa ------");
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        
        if(getIdade() > 0){
         System.out.println("Idade: " + getIdade());   
        }
        else{
            System.out.println("Idade invalida");
        }
    }
    
    
}
