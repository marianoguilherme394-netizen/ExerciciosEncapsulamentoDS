/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex12_12_ValidaçãoDeNotasDoAluno;

/**
 *
 * @author Admin
 */
public class Teste {
    public static void main (String [] args){
        Aluno a1 = new Aluno();
        
        a1.setNome("Isabella");
        a1.setNota1(10);
        a1.setNota2(10);
        
        a1.calcularMedia();
        a1.estaAprovado();
        
    }
    
}
