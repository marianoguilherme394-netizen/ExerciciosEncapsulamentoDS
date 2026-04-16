/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex12_12_ValidaçãoDeNotasDoAluno;

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
        if(nota1>=0 && nota1<=10){
            this.nota1 = nota1;
        }
        else{
            this.nota1 = 0;
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if(nota2>=0 && nota2<=10){
            this.nota2 = nota2;
        }
        else{
            this.nota2 = 0;
        }
    }
    
    public void calcularMedia(){
        double media = (getNota1() + getNota2())/2;
        
        System.out.println("Nome: " + getNome());
        
        if(getNota1()>=0 && getNota1()<=10){
            System.out.println("Nota1: " + getNota1());
        }
        else{
            System.out.println("Nota invalida");
        }
        
        if(getNota2()>=0 && getNota2()<=10){
            System.out.println("Nota2: " + getNota2());
        }
        else{
            System.out.println("Nota invalida");
        }
        
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
