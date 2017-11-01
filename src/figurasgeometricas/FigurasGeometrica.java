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
public abstract class FigurasGeometrica {
    
    protected double valor1;

    public FigurasGeometrica(double valor1){
        super();
        this.valor1= valor1;
    }
    
    public double getValor1(){
        return valor1;
    }
    
    public void setValor1(double valor1){
        this.valor1 = valor1;   
    }
    
    public abstract double getArea();
    public abstract double getPerimetro();
    
}
