/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex14_14_MetodosPublicosEPrivadosEmEmpresa;

/**
 *
 * @author Admin
 */
public class Teste {
    public static void main(String [] args){
        Empresa e1 = new Empresa("Isabella", "456.086.765.74", "RELATORIO GIGANTE SOBRE A EMPRESA");
        e1.exibirInfo();
        e1.gerarRelatorio();
        
        //Não é possivel acessar o metodo privado
    }
}
