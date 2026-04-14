/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex8_8_ClasseFuncionarioComSalárioMínimo;

/**
 *
 * @author Admin
 */
public class Funcionario {
    
    private String nome;
    private double salario;
    private String cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario>=1412.00){
            this.salario = salario;
        }
        else{
            this.salario = 0;
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void Info(){
        System.out.println("----- Inforamções do Funcionario -----");
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + getCargo());
        
        if(getSalario()>= 1412){
            System.out.println("Salario: R$" + getSalario());
        }
        else{
            System.out.println("Salario inserido incorretamente");
        }
    }
    
    
    
}
