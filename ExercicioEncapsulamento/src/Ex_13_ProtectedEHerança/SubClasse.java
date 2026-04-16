/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_13_ProtectedEHerança;

/**
 *
 * @author Admin
 */
public class SubClasse extends ConfiguracaoSistema{
    
    public SubClasse(String versaoSistema) {
        super(versaoSistema);
    }
    
    public void testarProtected(){
        System.out.println("Versão do sistema: " + this.versaoSistema);
    }
    //A subclasse consegue acessar o atributo versaoSistema com o modificador protected
}
