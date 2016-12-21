/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class ScannerJava {

   
    public static void main(String[] args) {
        String nombre;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre=scanner.nextLine();
        
        System.out.println("Bienvenido "+nombre+"a Java utilizando la clase Scanner");
        
        
        String num;
        System.out.println("Ingrese su numero favorito");
        num=scanner.nextLine();
        System.out.println("Su numero favorito es "+num);
        
    }
    
}
