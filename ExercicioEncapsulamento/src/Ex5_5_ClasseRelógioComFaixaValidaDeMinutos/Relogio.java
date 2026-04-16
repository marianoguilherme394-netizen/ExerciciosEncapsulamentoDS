/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex5_5_ClasseRelógioComFaixaValidaDeMinutos;

/**
 *
 * @author Admin
 */
public class Relogio {
    
    private int minuto;

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if(minuto>=0 && minuto<60){
            this.minuto = minuto;
        }
        else{
            this.minuto = 0;
        }
    }
    
    public void MostrarMinutos(){
        System.out.println("------ Validar Minutos ------");
        
        if(getMinuto()>0 && getMinuto()<60){
            System.out.println("O relogia marca " + getMinuto() + " minutos");
        }
        else{
            System.out.println("Erro!");
        }
    }
    
}
