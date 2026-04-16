/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex15_15_ClasseEnderecoComValidaçãoDeCEP;

/**
 *
 * @author Admin
 */
public class Endereco {
    
    private String rua;
    private String bairro;
    private String cep;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if(cep.matches("\\d{8}")){
            this.cep = cep;
        }
        else{
            this.cep = "Cep indisponivel";
        }
        
    }
    
    public void Info(){
        System.out.println("Rua: " + getRua());
        System.out.println("Bairro: " + getRua());
        System.out.println("Cep: " + getCep());
    }
    
    
    
}
