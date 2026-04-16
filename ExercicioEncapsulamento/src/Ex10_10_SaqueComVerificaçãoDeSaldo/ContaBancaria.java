/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex10_10_SaqueComVerificaçãoDeSaldo;

/**
 *
 * @author Admin
 */
public class ContaBancaria {
    
    private String NumeroConta;
    private double saldo = 5000.00;
    private String titular;

    
    public String getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(String NumeroConta) {
        this.NumeroConta = NumeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    
    public void depositar(double valor){
        System.out.println("----- Depositar -----");
        System.out.println("Titular: " + getTitular());
        System.out.println("Numero da Conta: " + getNumeroConta());
        System.out.println("Deposito: R$" + valor);
    }
    
    public void sacar(double valor){
        if(saldo>=valor){
            System.out.println("----- Sacar -----");
            System.out.println("Titular: " + getTitular());
            System.out.println("Numero da Conta: " + getNumeroConta());
            System.out.println("Saque: R$" + valor);
        }
        else{
            System.out.println("----- Sacar -----");
            System.out.println("Titular: " + getTitular());
            System.out.println("Numero da Conta: " + getNumeroConta());
            System.out.println("Saque: Saldo insuficiente para saque");
        }
}
    
}
