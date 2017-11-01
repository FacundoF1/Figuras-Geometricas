/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;
import java.awt.Graphics;

/**
 *
 * @author facundo
 */
public class CirculoDibujable extends Circulo implements FiguraDibujable {
    private int x;
    private int y;
    
    public CirculoDibujable(double valor1, int x, int y){
        
        super(valor1);
        this.x = x;
        this.y = y;
        
    }
    
   @Override
    public void setCoordenadas(int x, int y){
        
        this.x= x;
        this.y = y;
    }
    
    @Override
    public void dibujar2D(Graphics g){
        g.drawOval(this.x, this.y, (int)this.valor1, (int)this.valor1);
    }    
}

