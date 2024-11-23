/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parte_1_problema_12;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Samuel Cataño C
 */
public class Parte_1_Capitulo_4_Ejercicio_propuesto_numero_23 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner lector = new Scanner(System.in);
        
        double A, B, C, r1, r2, r3, r;
        String sign1, sign2;
        System.out.println("Por favor ingrese el parámetro A de la ecuación:");
        A = lector.nextDouble();
        System.out.println("Por favor ingrese el parámetro B de la ecuación:");
        B = lector.nextDouble();
        System.out.println("Por favor ingrese el parámetro C de la ecuación:");
        C = lector.nextDouble();
        
        r = B*B-4*A*C;
        if (r>=0){
            r1 = Math.floor(100*(-B+Math.sqrt(r))/(2*A)+0.5)/100;
            r2 = Math.floor(100*(-B-Math.sqrt(r))/(2*A)+0.5)/100;
            System.out.println("Las raíces de la ecuación son los números reales "+r1+" y "+r2);
        } else{
            r1 = Math.floor(100*(Math.sqrt(-r))/(2*A)+0.5)/100;
            r2 = Math.floor(100*(-Math.sqrt(-r))/(2*A)+0.5)/100;
            if (B==0) {
                System.out.println("Las raíces de la ecuación son los números imaginarios "+r1+"i y "+r2+"i");
            } else {
                r3 = Math.floor(100*(-B/(2*A))+0.5)/100;
                System.out.println("Las raíces de la ecuación son los números complejos "+r3+"+("+r1+")i y "+r3+"+("+r2+")i");
            }
        }
    }
}
