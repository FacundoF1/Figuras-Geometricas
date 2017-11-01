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
public class Circulo extends FigurasGeometrica {

    public Circulo(double valor1) {
     super(valor1);
    }

    @Override
    public double getArea() {
     return Math.PI*Math.pow(this.valor1, 2);
    }
    
    @Override
    public double getPerimetro() {
        return Math.PI*this.valor1;
    }
}


