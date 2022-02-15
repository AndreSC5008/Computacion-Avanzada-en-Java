/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Act4;

/**
 *
 * @author ansan
 */
public class Triangulo {
    private double base, altura, perimetroCalculado, areaCalculada;

   

    public Triangulo(String base, String altura) {
        this.base = Double.parseDouble(base) ;
        this.altura = Double.parseDouble(altura);
    }
    
    public void area(){
        double area= getBase()* getAltura()/2; 
        setAreaCalculada(area);
    }
    
    public void perimetro(){
        double perimetro= getBase()*3; 
        setPerimetroCalculado(perimetro);
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
    
     public double getPerimetroCalculado() {
        return perimetroCalculado;
    }

    public void setPerimetroCalculado(double perimetroCalculado) {
        this.perimetroCalculado = perimetroCalculado;
    }

    public double getAreaCalculada() {
        return areaCalculada;
    }

    public void setAreaCalculada(double areaCalculada) {
        this.areaCalculada = areaCalculada;
    }
    
    
    
}
