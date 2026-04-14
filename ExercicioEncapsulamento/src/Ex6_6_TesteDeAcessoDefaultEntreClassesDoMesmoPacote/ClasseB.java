/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex6_6_TesteDeAcessoDefaultEntreClassesDoMesmoPacote;

/**
 *
 * @author Admin
 */
public class ClasseB extends ClasseA{
    
    public ClasseB(int numero) {
        super(numero);
    }
    
    public void MostrarNumero(){
        System.out.println("O numero e " + this.numero);
    }
    
}
