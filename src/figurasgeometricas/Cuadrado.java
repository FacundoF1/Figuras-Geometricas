/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author facundo
 */
public class Cuadrado extends FigurasGeometrica{
    
    public Cuadrado(double valor1){
        super(valor1);
    }
    
    @Override
    public double getArea(){
        return Math.pow(this.valor1, 2);
    }
    
    @Override
    public double getPerimetro(){
        return this.valor1*4;
    }
    
}
