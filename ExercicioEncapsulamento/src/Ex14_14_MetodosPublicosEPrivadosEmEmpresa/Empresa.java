/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex14_14_MetodosPublicosEPrivadosEmEmpresa;

/**
 *
 * @author Admin
 */
public class Empresa {
    
    String nome;
    String cpf;
    String Relatorio;
    
    public Empresa(String nome, String cpf, String Relatorio){
        this.nome=nome;
        this.cpf=cpf;
        this.Relatorio=Relatorio;
    }
    
    public void exibirInfo(){
        System.out.println("nome: " + this.nome );
        System.out.println("cpf: " + this.cpf );
    }
    
    private void gerarRelatorio(){
        System.out.println("Relatorio da empresa: " + this.Relatorio);
    }
}
