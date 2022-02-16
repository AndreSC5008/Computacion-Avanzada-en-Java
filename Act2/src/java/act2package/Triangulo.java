/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act2package;
public class Triangulo {
    private double base, altura;

    public Triangulo(String base, String altura) {
        this.base = Double.parseDouble(base) ;
        this.altura = Double.parseDouble(altura);
    }
    
    public double area(){
        double area= getBase()* getAltura()/2; 
        return area;
    }
    
    public double perimetro(){
        double perimetro= getBase()*3; 
        return perimetro;
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
    
}
