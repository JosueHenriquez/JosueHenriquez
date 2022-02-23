package gj05ricaldone.practica1;

import java.util.Scanner;

public class principal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cual es su nombre? ");
        String nombre = scan.nextLine();
        System.out.println("Hola "+nombre);
    }  
}
