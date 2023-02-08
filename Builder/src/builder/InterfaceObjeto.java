/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author aluno
 */
public interface InterfaceObjeto {
    public void reset();
    public void setCaracteristicas(int x);
    public void setAltura(int y);
    public void setComprimento(int z);
    public InterfaceObjeto build();
}
