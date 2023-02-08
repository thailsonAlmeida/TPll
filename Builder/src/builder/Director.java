/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author aluno
 */
public class Director {
    InterfaceObjeto objeto;
    
    public void setObjeto(InterfaceObjeto objeto){
        this.objeto = objeto;
    }
    
    public InterfaceObjeto construcao01(){
        objeto.reset();
        objeto.setAltura(25);
        objeto.setCaracteristicas(35);
        objeto.setComprimento(55);
        
        return objeto.build();
    }
}
