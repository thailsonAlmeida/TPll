/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author aluno
 */
public class Objeto1 implements InterfaceObjeto {

    Objeto1 objeto;
    
    @Override
    public void reset() {
        objeto = new Objeto1();
    }   
    
    @Override
    public void setCaracteristicas(int x) {
        objeto.setCaracteristicas(x);
    }

    @Override
    public void setAltura(int y) {
        objeto.setAltura(y);
    }

    @Override
    public void setComprimento(int z) {
        objeto.setComprimento(z);
    }

    @Override
    public Objeto1 build() {
        return objeto;
    }
    
}
