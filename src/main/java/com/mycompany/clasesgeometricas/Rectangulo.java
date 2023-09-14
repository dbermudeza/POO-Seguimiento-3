package com.mycompany.clasesgeometricas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Rectangulo {
    double base, altura;
    
    Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    double calcularArea() {
        return base*altura;
    }
    
    double calcularPerimetro() {
        return (2*base)+(2*altura);
    }
}
