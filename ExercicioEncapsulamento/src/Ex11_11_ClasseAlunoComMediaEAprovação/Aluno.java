/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex11_11_ClasseAlunoComMediaEAprovação;

/**
 *
 * @author Admin
 */
public class Aluno {
    
    private String nome;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public void calcularMedia(){
        double media = (getNota1() + getNota2())/2;
        
        System.out.println("Nome: " + getNome());
        System.out.println("Media: " + media);
    }
    
    public void estaAprovado(){
        double media = (getNota1() + getNota2())/2;
        
        if(media>=6){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
