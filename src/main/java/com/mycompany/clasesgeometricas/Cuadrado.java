
package com.mycompany.clasesgeometricas;

public class Cuadrado {
    double lado;
    
    Cuadrado(double lado) {
        this.lado = lado;
    }
    
    double calcularArea() {
        return lado*lado;
    }
    
    double calcularPerimetro() {
        return lado*4;
    }
}
