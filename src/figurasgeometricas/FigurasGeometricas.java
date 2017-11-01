/*
 * 
 * 
 * Programa: Modelado de Clases - Figuras.
 * Clases necesarias para la creación de objetos "figuras geometricas."
 *
 *
 */
package figurasgeometricas;

import java.util.Scanner;

/**
 *
 * @author facundo ferrari
 * @version 1.0.0
 * @date Obtubre 2017 .- 
 * @web  http://facundoferrari.ml
 *  
 */
public class FigurasGeometricas {
    
    public static void main(String[] args) {
        
        //Libreria para ingresar datos
        Scanner in = new Scanner( System.in );
        int num, base, altura;
        base = 5; altura = 2;
        
        //Impresión e ingreso de datos para inicializar el sistema
        System.out.println("================== BIENVENIDO AL SISTEMA ==================");
        System.out.println("");
        
        //Se crea un bucle donde permite ingresar y salir de los diferentes modulos del sistema
        while(true){
        
            System.out.println(" - Por favor Ingrese un número para acceder al calculo de las figuras. \n");
            System.out.println(" - Opción 1: Circulo .-");
            System.out.println(" - Opción 2: Cuadrado .-");
            System.out.println(" - Opción 3: Triangulo .- \n");
            System.out.println(" - Opción 0: Salir del Sistema .-\n");
            num = in.nextInt();
            FigurasGeometrica figura;
                if( num == 1 ){
                    figura = new Circulo(base);
                    System.out.println(figura.getClass());
                    System.out.println("************************************");
                    System.out.println("Diametro: "+base);
                    System.out.println("Superficie: "+figura.getArea());
                    System.out.println("Perimetro: "+figura.getPerimetro());   
                    System.out.println("************************************");      
                    figura = new Circulo(base);
                }
                if( num == 2 ){
                    figura = new Cuadrado(base);
                    System.out.println(figura.getClass());
                    System.out.println("************************************");
                    System.out.println("Base: "+base);
                    System.out.println("Altura: "+base);
                    System.out.println("Superficie: "+figura.getArea());
                    System.out.println("Perimetro: "+figura.getPerimetro());   
                    System.out.println("************************************");
                }
                if( num == 3 ){
                    figura = new Triangulo(base,altura);
                    System.out.println(figura.getClass());
                    System.out.println("************************************");
                    System.out.println("Base: "+base);
                    System.out.println("Altura: "+altura);
                    System.out.println("Superficie: "+figura.getArea());
                    System.out.println("Perimetro: "+figura.getPerimetro());   
                    System.out.println("************************************");
                }
        
            System.out.println("");
        if( num == 0) break; //condición para salir de la iteración
        }//END WHILE   
    }
}
